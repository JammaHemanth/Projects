package com.tmf.botique.backend.moels;

public class Dress {
	private int dressId;
	private String dressName, category, brand, size;
	private double cost;
	public Dress(int dressId, String dressName, String category, String brand, String size, double cost) {
		super();
		this.dressId = dressId;
		this.dressName = dressName;
		this.category = category;
		this.brand = brand;
		this.size = size;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Dress [dressId=" + dressId + ", dressName=" + dressName + ", category=" + category + ", brand=" + brand
				+ ", size=" + size + ", cost=" + cost + "]";
	}
	
	
}
