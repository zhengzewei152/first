package com.meituan.service;

import com.meituan.dao.BusinessShopDao;

public class BusinessShopService {
	BusinessShopDao bsd = new  BusinessShopDao();
	public void regist(String id, String name) throws Exception {
		bsd.regist(id,name);
	}
	
}
