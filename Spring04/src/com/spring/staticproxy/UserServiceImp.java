package com.spring.staticproxy;


public class UserServiceImp implements IUserService{

	@Override
	public boolean login(String name, String password) {
		if(name.equals("zhangxixian") && password.equals("123456")) {
			System.out.println("业务逻辑：用户zhangxixian登录成功");
			
			return true;
		}else {
			System.out.println("业务逻辑：用户adi登录失败");
			
			return false;
		}
	}
	
}
