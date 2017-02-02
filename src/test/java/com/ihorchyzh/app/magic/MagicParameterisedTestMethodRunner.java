package com.ihorchyzh.app.magic;

import junitparams.internal.TestMethod;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.Statement;

import java.lang.reflect.Field;

/**
 * Testmethod-level functionalities for parameterised tests
 *
 * @author Pawel Lipinski
 */
public class MagicParameterisedTestMethodRunner {

    public final MagicTestMethod method;
    private int count;

    public MagicParameterisedTestMethodRunner(MagicTestMethod testMethod) {
        this.method = testMethod;
    }

    private int nextCount() {
        return count++;
    }

    int count() {
        return count;
    }

    Object currentParamsFromAnnotation() {
        return method.parametersSets()[nextCount()];
    }

    void runTestMethod(Statement methodInvoker, RunNotifier notifier) {
        Description methodWithParams = findChildForParams(methodInvoker, method.describe());

        runMethodInvoker(notifier, methodInvoker, methodWithParams);
    }

    private void runMethodInvoker(RunNotifier notifier, Statement methodInvoker, Description methodWithParams) {
        EachTestNotifier eachNotifier = new EachTestNotifier(notifier, methodWithParams);
        eachNotifier.fireTestStarted();
        try {
            methodInvoker.evaluate();
        } catch (AssumptionViolatedException e) {
            eachNotifier.addFailedAssumption(e);
        } catch (Throwable e) {
            eachNotifier.addFailure(e);
        } finally {
            eachNotifier.fireTestFinished();
        }
    }

    private Description findChildForParams(Statement methodInvoker, Description methodDescription) {
        if (System.getProperty("JUnitParams.flat") != null)
            return methodDescription;

        MagicInvokeParameterisedMethod parameterisedInvoker = findParameterisedMethodInvokerInChain(methodInvoker);

        for (Description child : methodDescription.getChildren()) {
            if (parameterisedInvoker.matchesDescription(child))
                return child;
        }
        return null;
    }

    private MagicInvokeParameterisedMethod findParameterisedMethodInvokerInChain(Statement methodInvoker) {
        while (methodInvoker != null && !(methodInvoker instanceof MagicInvokeParameterisedMethod))
            methodInvoker = nextChainedInvoker(methodInvoker);

        if (methodInvoker == null)
            throw new RuntimeException("Cannot find invoker for the parameterised method. Using wrong JUnit version?");

        return (MagicInvokeParameterisedMethod) methodInvoker;
    }

    private Statement nextChainedInvoker(Statement methodInvoker) {
        Field[] declaredFields = methodInvoker.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            Statement statement = statementOrNull(methodInvoker, field);
            if (statement != null)
                return statement;
        }

        return null;
    }

    private Statement statementOrNull(Statement methodInvoker, Field field) {
        if (Statement.class.isAssignableFrom(field.getType()))
            return getOriginalStatement(methodInvoker, field);

        return null;
    }

    private Statement getOriginalStatement(Statement methodInvoker, Field field) {
        field.setAccessible(true);
        try {
            return (Statement) field.get(methodInvoker);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
