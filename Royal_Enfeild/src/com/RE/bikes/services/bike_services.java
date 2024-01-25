package com.RE.bikes.services;
import java.util.Scanner;

import com.RE.bikes.RE_bikes_details;
public class bike_services implements Showroom {

	private int index = 0;
	private int bid = 10001;
	private Scanner scan = new Scanner(System.in);
	public void addbikes() {
		if (index >= 10) {
				System.out.print("Soory, input is invalid");
		} else {
			System.out.println("Enter Bike Name ");
			String name = scan.next();
			System.out.println("Enter Bike Category");
			String category = scan.next();
			System.out.println("Enter Bike color");
			String color = scan.next();
			System.out.println("Enter the Bike model");
			int model = scan.nextInt();
			System.out.println("Enter the Bike cost");
			double cost = scan.nextDouble();
			
			RE_bikes_details Bikes = new RE_bikes_details(bid,name,category,color,model,cost);
			
               Bike[index] = Bikes;
			
			//Increase the index and dress id
		    index++;
			bid++;
		}
			
	}
	@Override
	public void updatebikes() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displaybikes() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletebikes() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displaybikes(int bikeID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displaybikes(String category) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Showroom() {
		// TODO Auto-generated method stub
		
	}
	public void botiqueServices() {
		while(true) {
			System.out.println("Welcome Hi-FI Botique.......");
			System.out.println("Press 1 to Add a new bike");
			System.out.println("Press 2 for Display Available bike");
			System.out.println("Press 3 for Display bike by Id");
			System.out.println("Press 4 for Display bike by category");
			System.out.println("Press 5 for Update a bike data");
			System.out.println("Press 6 for Delete an existing bike");
			System.out.println("Press 9 for Exit from the Menu");
			System.out.println("Enter your Choice ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : addbikes();
			         break;
			case 2 : displaybikes();
			         break;
			case 3 :
				System.out.println("Enter the Product id ");
				int id = scan.nextInt();
				displaybikes(id);
				break;
			case 4: 
				System.out.println("Enter a category ");
				String category = scan.next();
				displaybikes(category);
				break;
			case 9:
				System.exit(0);
			}
		}
	}
}

