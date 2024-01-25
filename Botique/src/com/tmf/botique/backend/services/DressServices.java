package com.tmf.botique.backend.services;

import java.util.Scanner;

import com.tmf.botique.backend.moels.Dress;

public class DressServices implements BotiqueServices {
	private int index = 0;
	private int pid = 1000001;
	private Scanner scan = new Scanner(System.in);
	@Override
	public void addDress() {
		if(index >= 10) {
			System.out.println("Sorry!!! We have insufficient storage");
		}
		else {
			// TODO Auto-generated method stub
			System.out.println("Enter Dress Name ");
			String name = scan.next();
			System.out.println("Enter Dress Category");
			String cat = scan.next();
			System.out.println("Enter Dress size");
			String size = scan.next();
			System.out.println("Enter the Brand details");
			String brand = scan.next();
			System.out.println("Enter the cost");
			double cost = scan.nextDouble();
			
			//Adding details to the Dress object
			Dress drs = new Dress(pid,name,cat,brand,size,cost);
		
			//Adding dress object to the Array.
			dresses[index] = drs;
			
			//Increase the index and dress id
			index++;
			pid++;
		}
		
	}

	@Override
	public void updateDress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayDress() {
		// TODO Auto-generated method stub
		for(Dress drs : dresses) {
			System.out.println(drs);
		}
	}

	@Override
	public void displayDress(int dressId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayDress(String Category) {
		// TODO Auto-generated method stub
		
	}

	public void botiqueServices() {
		while(true) {
			System.out.println("Welcome Hi-FI Botique.......");
			System.out.println("Press 1 to Add a new Dress");
			System.out.println("Press 2 for Display Available Dresses");
			System.out.println("Press 3 for Display a Dress by Id");
			System.out.println("Press 4 for Display Dresses by category");
			System.out.println("Press 5 for Update a Dress data");
			System.out.println("Press 6 for Delete an existing Dress");
			System.out.println("Press 9 for Exit from the Menu");
			System.out.println("Enter your Choice ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : addDress();break;
			case 2 : displayDress();break;
			case 3 :
				System.out.println("Enter the Product id ");
				int id = scan.nextInt();
				displayDress(id);
				break;
			case 4: 
				System.out.println("Enter a category ");
				String cat = scan.next();
				displayDress(cat);
				break;
			case 9:
				System.exit(0);
			}
		}
	}
}
