package com.meituan.service;

import java.sql.SQLException;



import com.meituan.damian.User;
import com.meituan.dao.UserDao;
import com.meituan.exception.UserException;

public class UserService {
	UserDao ud = new UserDao();
	
	public void regist(User user) throws UserException {
		try {
			ud.addUser(user);
		
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException("注册失败");
		}
	}
	 public User findUserByUsernamePassword(String username,String password) throws UserException{
		 User user;
		 try {
			 user= ud.findUserByUsernamePassword(username,password);
			if(user==null){
				throw new UserException("用户名或密码错误");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserException("用户名或密码错误");
		}
		return user;
	 }
}
