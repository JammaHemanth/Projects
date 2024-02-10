import java.util.Scanner;
public class Star {
	public static void main(String[] args) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n = sc.nextInt();
		for(i = 1 ; i<=n ; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

	}

}
