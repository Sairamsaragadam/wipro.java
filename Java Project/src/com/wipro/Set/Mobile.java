package com.wipro.Set;

public class Mobile implements Comparable<Mobile>{
	private int price;
	private String brand;
	
	public Mobile(int price, String brand) {
		this.price = price;
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}

	@Override
	public int compareTo(Mobile other) {
		int prices = Integer.compare(this.price, other.price);
		
		if (prices== 0) {
			return this.brand.compareTo(other.brand);
		}
		return prices;

	}
	@Override
	public String toString() {
		return "Mobile " + "price " + price + " Brand " + brand;
	}

}