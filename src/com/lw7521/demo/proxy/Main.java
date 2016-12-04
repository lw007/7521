package com.lw7521.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;

public class Main {

	public static void main(String[] args) {

		TestInterface1 test1 = new Test();
		Method[] methods = test1.getClass().getMethods();
		//TestInterface2 test2 = new Test();
		InvocationHandler handler1 = new DynamicProxy(test1);
		//InvocationHandler handler2 = new DynamicProxy(test2);
		
		TestInterface2 t11 = (TestInterface2) Proxy.newProxyInstance(test1.getClass().getClassLoader(), test1.getClass().getInterfaces(), handler1);
		//TestInterface1 t12 = (TestInterface1) Proxy.newProxyInstance(test1.getClass().getClassLoader(), test1.getClass().getInterfaces(), handler2);
		
		//TestInterface2 t21 = (TestInterface2) Proxy.newProxyInstance(test2.getClass().getClassLoader(), test2.getClass().getInterfaces(), handler1);
		//TestInterface2 t22 = (TestInterface2) Proxy.newProxyInstance(test2.getClass().getClassLoader(), test2.getClass().getInterfaces(), handler2);
		
		String string = t11.Print2().toString();
		System.out.println(string);
		//t12.Print1();
		//t21.Print2();
		//t22.Print2();
	
	}

}
