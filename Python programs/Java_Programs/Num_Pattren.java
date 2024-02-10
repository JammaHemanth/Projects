import java.util.Scanner;
public class Num_Pattren {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int rows=sc.nextInt();
		for(int i =1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i) ;
			}
			System.out.println(" ");
		}
	}

}
