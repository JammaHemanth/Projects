import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int i,num,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		num = sc.nextInt();
		for(i = 1; i<=num ; i++) {
			fact = fact * i;
		}
		System.out.print("The factorial of the given " +num+ " is " +fact);

	}

}
