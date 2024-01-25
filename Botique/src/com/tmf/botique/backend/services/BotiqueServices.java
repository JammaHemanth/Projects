package com.tmf.botique.backend.services;

import com.tmf.botique.backend.moels.Dress;

public interface BotiqueServices {
	//Create an array of dresses to store dress data.
	Dress dresses[] =  new Dress[10];
	
	//Operations
	void addDress();
	void updateDress();
	void deleteDress();
	void displayDress();
	void displayDress(int dressId);
	void displayDress(String Category);
	void botiqueServices();
}
