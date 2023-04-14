package com;

public class Dish {

	private int sNo ;
	private String dishName ;
	private double price ;
	public Dish(int sNo, String dishName, double price) {
		super();
		this.sNo = sNo;
		this.dishName = dishName;
		this.price = price;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
}
