package com.ihorchyzh.app.magic;

import junitparams.internal.TestMethod;
import junitparams.internal.Utils;
import junitparams.internal.annotation.FrameworkMethodAnnotations;
import junitparams.internal.parameters.ParametersReader;
import junitparams.naming.MacroSubstitutionNamingStrategy;
import junitparams.naming.TestCaseNamingStrategy;
import org.junit.Ignore;
import org.junit.runner.Description;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * A wrapper for a test method
 *
 * @author Pawel Lipinski
 */
public class MagicTestMethod extends TestMethod {

    private MagicFrameworkMethodAnnotations frameworkMethodAnnotations;
    private TestCaseNamingStrategy namingStrategy;
    private Class<?> testClass;

    public MagicTestMethod(FrameworkMethod method, TestClass testClass) {
        super(method, testClass);
        this.frameworkMethodAnnotations = new MagicFrameworkMethodAnnotations(method);
        this.namingStrategy = new MacroSubstitutionNamingStrategy(this);
        this.testClass = testClass.getJavaClass();
    }

    static List<MagicTestMethod> listFrom(List<FrameworkMethod> annotatedMethods, TestClass testClass) {
        ArrayList methods = new ArrayList();
        Iterator i$ = annotatedMethods.iterator();

        while(i$.hasNext()) {
            FrameworkMethod frameworkMethod = (FrameworkMethod)i$.next();
            methods.add(new MagicTestMethod(frameworkMethod, testClass));
        }

        return methods;
    }

    private boolean hasNoParameters() {
        return this.isParameterised() && this.parametersSets().length == 0;
    }

    boolean isParameterised() {
        return this.frameworkMethodAnnotations.isParametrised();
    }

    void warnIfNoParamsGiven() {
        if(this.isNotIgnored() && this.isParameterised() && this.parametersSets().length == 0) {
            System.err.println("Method " + this.name() + " gets empty list of parameters, so it\'s being ignored!");
        }

    }

    Description describe() {
        if(this.isNotIgnored() && !this.describeFlat()) {
            Description parametrised = Description.createSuiteDescription(this.name(), new Annotation[0]);
            Object[] params = this.parametersSets();

            for(int i = 0; i < params.length; ++i) {
                Object paramSet = params[i];
                String name = this.namingStrategy.getTestCaseName(i, paramSet);
                String uniqueMethodId = MagicUtils.uniqueMethodId(i, paramSet, this.name());
                parametrised.addChild(Description.createTestDescription(this.testClass().getName(), name, uniqueMethodId));
            }

            return parametrised;
        } else {
            return Description.createTestDescription(this.testClass(), this.name(), this.frameworkMethodAnnotations.allAnnotations());
        }
    }

    private boolean describeFlat() {
        return System.getProperty("JUnitParams.flat") != null;
    }

    private Class<?> testClass() {
        return this.testClass;
    }
}
