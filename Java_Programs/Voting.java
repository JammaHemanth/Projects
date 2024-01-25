import java.util.Scanner;
public class Voting {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int votingage = 18;
      System.out.print("Welcome to the voting camp \n");
      System.out.print("Enter your age: ");
       int age = sc.nextInt();
       if (age < votingage) {
    	   System.out.print("Sorry, You are not eligible for voting \n");
       } else {
    	   System.out.print("You are eligible for Voting \n");
       }
       System.out.print("Choose your Option \n");
       System.out.print("1.TDP 2.BRS \n");
       System.out.print("Enter your Option \n");
       int vote = sc.nextInt();
       switch(vote) {
       case 1: 
    	    System.out.print("1.TDP \n");
    	    break; 
    	case 2: 
            System.out.print("2.BRS \n");
            break;
       }
       System.out.print("Thanks for the Voting");
	}

}
