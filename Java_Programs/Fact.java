import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		for(i = 1; i<=num ;i++) {
			fact = fact * i;
		}
		System.out.print("The factorial " +num+ " is " +fact);
	}

}
