package com.RE.bikes;

public class RE_bikes_details {
	private int bikeID;
	private String color, category, name;
	private int model;
	private double cost;
	public RE_bikes_details(int bikeID,  String name, String color,String category,int model,double cost) {
		super();
		this.bikeID = bikeID;
		this.name = name;
		this.color = color;
		this.category = category;
		this.model = model;
		this.cost = cost;	
		}
	@Override
	public String toString() {
		return "RE_bikes_details [bikeID=" + bikeID + ", color=" + color + ", category=" + category + ", name=" + name
				+ ", model=" + model + ", cost=" + cost + "]";
	}

}
