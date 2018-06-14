package com.meituan.damian;

public class Business {
	private String business_id; //商家id
	private String business_name; //商家账号名字
	private String business_password; //商家账号密码；
	private String business_shopname; //店铺名字
	private String shop_id; //商店id号
	public String getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public String getBusiness_password() {
		return business_password;
	}
	public void setBusiness_password(String business_password) {
		this.business_password = business_password;
	}
	public String getBusiness_shopname() {
		return business_shopname;
	}
	public void setBusiness_shopname(String business_shopname) {
		this.business_shopname = business_shopname;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	
}
