import java.util.Scanner;
class Hello{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i,number = sc.nextInt();
		for(i=0;i<number;i++) {
			System.out.print("Hello World\n");
		}
	}
}