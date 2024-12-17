package com.test.reflect_error_test;

import android.util.Log;
import kotlin.Unit;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.ReflectJvmMapping;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public void executeMyMethodDirectly() {
        mymethod("directly");
    }

    public void mymethod(String origin) {
        Log.d("TAG", ">>>>>>>>TEST<<<<<<<<<< :::: " + origin);
    }

    public void executeMyMethodByReflection() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Test.class.getDeclaredMethod("mymethod", String.class);

        method.invoke(this, "reflection");

        KFunction<Unit> ref = (KFunction<Unit>) ReflectJvmMapping.getKotlinFunction(method);
        ref.call(this, "reflection with KFunction");
    }
}