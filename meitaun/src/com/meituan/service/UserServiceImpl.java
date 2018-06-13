package com.meituan.service;

import java.sql.SQLException;

import com.meituan.dao.UserDaoImpl;
import com.meituan.domain.User;

public class UserServiceImpl {
    UserDaoImpl ud=new UserDaoImpl();
    public User findUserName(String name,String password){
    	try {
			return ud.findUserName(name, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    	
    }
}
