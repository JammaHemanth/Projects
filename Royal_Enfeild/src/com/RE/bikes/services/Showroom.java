package com.RE.bikes.services;

import com.RE.bikes.RE_bikes_details;

public interface Showroom {
	RE_bikes_details Bike[] = new RE_bikes_details[10];
	void addbikes();
	void updatebikes();
	void displaybikes();
	void deletebikes();
	void displaybikes(int bikeID);
	void displaybikes(String category);
	void Showroom();
}
