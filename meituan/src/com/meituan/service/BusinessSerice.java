package com.meituan.service;

import com.meituan.damian.Business;
import com.meituan.dao.BusinessDao;

public class BusinessSerice {
	BusinessDao bdBusinessDao = new BusinessDao();
	public void regist(Business business) throws Exception {
		bdBusinessDao.regist(business);
	}
	public String checkName(Business bs) throws Exception {
		return bdBusinessDao.checkName(bs);
		
	}

}
