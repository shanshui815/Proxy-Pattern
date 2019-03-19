package com.spring.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;


public class LoggerHandler implements InvocationHandler{
	//目标对象，业务
	private Object delegate;
	
	public Object bind(Object delegate) {
		this.delegate = delegate;
		return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
				delegate.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		//调用目标的业务层方法
		result = method.invoke(delegate, args);
		//目标对象需要加入的功能定义在这里
		System.out.println("日志"+args[0]+"于"+new Date().toLocaleString()+"登录");
		return null;
	}
	
}
