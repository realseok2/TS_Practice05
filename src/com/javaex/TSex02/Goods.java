package com.javaex.TSex02;

public class Goods {

	private String name;
	private int price;
	
//-------------------------------------------------------------------------		생성자
	
	public Goods() {}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

//-------------------------------------------------------------------------		setter, getter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
//-------------------------------------------------------------------------		showInfo()
	
	public void showInfo() {
		System.out.println("상품명 : \t[ " + name + " ],\t가격 : \t[ " + price + "원 ] ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
