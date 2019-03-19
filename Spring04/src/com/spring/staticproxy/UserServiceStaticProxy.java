package com.spring.staticproxy;

import java.util.Date;

public class UserServiceStaticProxy implements IUserService{

	private IUserService userService;
	
	public UserServiceStaticProxy(IUserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public boolean login(String name, String password) {
		boolean isLogin = userService.login(name, password);
		System.out.println("日志："+name+"于"+new Date().toLocaleString()+"登录");
		return false;
	}
	
}
