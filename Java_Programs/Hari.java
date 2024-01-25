import java.util.Scanner;
public class Hari {

	public static void main(String[] args) {
     char name;
     char qualifaction;
     Scanner sc = new Scanner(System.in);
     System.out.println("Hi, Welcome this is about Hemanth kumar detiails");
     System.out.print("Enter your age: ");
     int age =sc.nextInt();
     if(age < 18) {
    	 System.out.println("Sorry,access denied");
     } else {
    	 System.out.println("This is the details given below");
    	 System.out.println("1. Mail I'd & Phone Number");
    	 System.out.println("2.Basic Education Qualifaction");
    	 System.out.println("3.Skills");
    	 System.out.println("4.Projects");
    	 int details = sc.nextInt();
    	 switch(details) {
         case 1: 
             System.out.println("jammahemanthkumar@gmail.com");
             System.out.println("9849136515");
             break;
    	 case 2: 
    		 System.out.println("This is about the educational background");
        	 System.out.println("10th in Viswateja School");
        	 System.out.println("11 & 12th (M.P.C) course in Narayana Jr. College");
        	 System.out.println("B.Tech in Sanketika Vidya Parishad Enggneering College affliated by A.U");
        	 System.out.println("B.Tech course in Mechanical Enggneering");
        	 System.out.println("Java Full stack course in Tech Mahindra");
        	 break;
         case 3: 
              System.out.println("Positive Thinking");
             break;
         case 4: 
             System.out.println("Projects");
             System.out.println("Royal Enfeild Project");
             System.out.println("This is about the Royal Enfeild bike website it contains all bike details with the model,mileage,cubic capcity,specification with all details in a table format and the bike images");
            break;  
            default: 
              System.out.print("Invalid Choice");
              break;
    	 } 
    		 
     }
	}

}
