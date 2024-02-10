import java.util.Scanner;
public class Star_Patrren {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int i,j,n;
    System.out.print("Enter a Patrren");
    n= sc.nextInt();
    for(i=0; i<=n; i++) {
    	for(j=0;j<=i;j++) {
    		System.out.print(" * ");
    	}
    }
    System.out.print(" ");
	}

}
