import java.util.Scanner;
public class Swtch_Calc {

	public static void main(String[] args) {
		int a,b,c;
    System.out.print("Enter 1st Number: ");
    Scanner sc = new Scanner(System.in);
    a= sc.nextInt();
    System.out.print("Enter 2nd Number: ");
    b= sc.nextInt();    
    
    System.out.println("Enter your option");
    System.out.println("1.Addition");
    System.out.println("2.Subtractin");
    System.out.println("3.Multiplication");
    System.out.println("4.Divison");
    int choice =sc.nextInt();
    switch(choice) {
    case 1:
    	c=a+b;
    	System.out.println("Addition of number is "+c);
    	break;
    case 2:
    	c=a-b;
    	System.out.println("Subtraction of number is "+c);
    	break;
    case 3:
    	c=a*b;
    	System.out.println("Multiplication of number is "+c);
    	break;
    case 4:
    	c=a/b;
    	System.out.println("Divison of number is "+c);
    	break;
    	
    }
    }

}
