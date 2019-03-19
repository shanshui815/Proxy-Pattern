package com.spring.staticproxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserServiceStaticProxyTest {

	@Test
	void test() {
		UserServiceStaticProxy userServiceStaticProxy =new UserServiceStaticProxy(new UserServiceImp());
		userServiceStaticProxy.login("zhangxixian","123456" );
	}

}
