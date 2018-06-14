package com.meituan.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.meituan.damian.Business;
import com.meituan.util.C3P0Util;

public class BusinessDao {

	public void regist(Business business) throws SQLException {
		QueryRunner qr=new QueryRunner(C3P0Util.getDataSource());
    	qr.update("insert into business values(?,?,?,?,?)", business.getBusiness_id(), business.getBusiness_name(),business.getBusiness_password(),business.getBusiness_shopname(),business.getShop_id());
	}

	public String checkName(Business bs) throws Exception {
		String shop_id = null;
		ArrayList<Business> list = new ArrayList<Business>();
		QueryRunner qr=new QueryRunner(C3P0Util.getDataSource());
		list = (ArrayList<Business>) qr.query("select shop_id from business where business_name =? and business_password = ?",new BeanListHandler<Business>(Business.class),bs.getBusiness_name(),bs.getBusiness_password());
		for(Business bss:list){
			shop_id = bss.getShop_id();
		}
		return shop_id;
	}

}
