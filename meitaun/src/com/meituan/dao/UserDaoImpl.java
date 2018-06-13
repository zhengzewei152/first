package com.meituan.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;



import com.meituan.domain.User;
import com.meituan.util.C3P0Util;

public class UserDaoImpl {
    public User findUserName(String name,String password) throws SQLException{
    	System.out.print(name);
    	
    	QueryRunner qr=new QueryRunner(C3P0Util.getDataSource());
    	System.out.print(qr.query("select * from users where username=? and password=?", new BeanHandler<User>(User.class),name,password));
    	return qr.query("select * from users where username=? and password=?", new BeanHandler<User>(User.class),name,password);
    }
}
