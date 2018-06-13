package com.meituan.damian;

public class Shop {
	
	private String id;
    private String name;
    private String category;
    private double startprice;
    private String img_url;
	public String getId() {
		return id;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getStartprice() {
		return startprice;
	}
	public void setStartprice(double startprice) {
		this.startprice = startprice;
	}
	
	
   
	
}
