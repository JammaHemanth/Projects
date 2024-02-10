import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
       int voteage = 18;
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to the vote polling camp");
       System.out.println("Enter a Number");
       int age = sc.nextInt();
       if (age < voteage) {
    	   System.out.println("Sorry, you are not eligible for voting");
       } else {
    	   System.out.println("You are eligible for voting");
    	   System.out.println("Choose the option below");
    	   System.out.println("1. TDP 2.JSP 3.TRS");
    	   System.out.println("Enter the option");
    	   int vote = sc.nextInt();
    	   switch(vote) {
    	   case 1: 
    		   System.out.println("1.TDP");
    		   break;
    	   case 2: 
    		   System.out.println("2.JSP");
    		   break;   
    	   case 3: 
    		   System.out.println("3.TRS");
    		   break;   
    	   default: 
    		   System.out.println("Invalid choice");
    		   break;   
    	   }
       }
       System.out.println("Thanks for voting");
	}

}