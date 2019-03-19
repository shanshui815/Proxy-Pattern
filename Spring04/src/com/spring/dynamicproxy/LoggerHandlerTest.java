package com.spring.dynamicproxy;

import org.junit.jupiter.api.Test;

/**
 * 1.动态代理：只要一个方法，继承InvocationHandler接口
 * @author ASUS
 *
 */
class LoggerHandlerTest {

	@Test
	void test() {
		LoggerHandler loggerHandler = new LoggerHandler();
		//只能用目标对象的接口来接收，因为实际返回值是目标对象的代理，而非目标对象
		IUserService userService =(IUserService) loggerHandler.bind(new UserServiceImp());
		userService.login("zhangxixian", "123456");
	}

}
