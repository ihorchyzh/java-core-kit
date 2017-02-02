package com.ihorchyzh.app.magic;

import junitparams.JUnitParamsRunner;
import junitparams.internal.ParameterisedTestClassRunner;
import junitparams.internal.ParametrizedTestMethodsFilter;
import junitparams.internal.TestMethod;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stereopasa on 2/2/2017.
 */
public class MagicJUnitParamsRunner extends JUnitParamsRunner {

    private Description description;
    private MagicParameterisedTestClassRunner parameterisedRunner = new MagicParameterisedTestClassRunner(getTestClass());
    private ParametrizedTestMethodsFilter parametrizedTestMethodsFilter = new ParametrizedTestMethodsFilter(this);


    public MagicJUnitParamsRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected Statement methodInvoker(FrameworkMethod method, Object test) {
        Statement methodInvoker = parameterisedRunner.parameterisedMethodInvoker(method, test);
        if (methodInvoker == null)
            methodInvoker = super.methodInvoker(method, test);

        return methodInvoker;
    }

    @Override
    public Description getDescription() {
        if (description == null) {
            description = Description.createSuiteDescription(getName(), getTestClass().getAnnotations());
            List<FrameworkMethod> resultMethods = getListOfMethods();

            for (FrameworkMethod method : resultMethods)
                description.addChild(describeMethod(method));
        }

        return description;
    }

    private List<FrameworkMethod> getListOfMethods() {
        List<FrameworkMethod> frameworkMethods = parameterisedRunner.returnListOfMethods();
        return parametrizedTestMethodsFilter.filteredMethods(frameworkMethods);
    }

    @Override
    protected void runChild(FrameworkMethod method, RunNotifier notifier) {
        if (handleIgnored(method, notifier))
            return;

        MagicTestMethod testMethod = parameterisedRunner.testMethodFor(method);
        if (parameterisedRunner.shouldRun(testMethod)){
            parameterisedRunner.runParameterisedTest(testMethod, methodBlock(method), notifier);
        }
        else{
            verifyMethodCanBeRunByStandardRunner(testMethod);
            super.runChild(method, notifier);
        }
    }

    private boolean handleIgnored(FrameworkMethod method, RunNotifier notifier) {
        TestMethod testMethod = parameterisedRunner.testMethodFor(method);
        if (testMethod.isIgnored())
            notifier.fireTestIgnored(describeMethod(method));

        return testMethod.isIgnored();
    }

    private void verifyMethodCanBeRunByStandardRunner(TestMethod testMethod) {
        List<Throwable> errors = new ArrayList<Throwable>();
        testMethod.frameworkMethod().validatePublicVoidNoArg(false, errors);
        if (!errors.isEmpty()) {
            throw new RuntimeException(errors.get(0));
        }
    }

}
