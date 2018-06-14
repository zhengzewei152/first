package com.meituan.dao;

import org.apache.commons.dbutils.QueryRunner;

import com.meituan.util.C3P0Util;

public class BusinessShopDao {
	public void regist(String id, String name) throws Exception {
		QueryRunner qr=new QueryRunner(C3P0Util.getDataSource());
    	qr.update("insert into shop(id,name) values(?,?)",id,name);
	}

}
