import java.util.Scanner;
public class MultipleChoice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answers[] = {"b","c","a"};
		String responses[] = {"","",""};
		
		System.out.println("1. If ‘APPLE’ is written as ‘BQQMF’ in a certain code, how will ‘ORANGE’ be written in the same code? ");
		System.out.println("a) PSUBOG");
		System.out.println("b) PSTBOH");
		System.out.println("c) PSTCNI");
		System.out.println("d) PSVTNF");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("2. If Z=52, and AND=38, then BOO will be equal to ?");
		System.out.println("a) 62");
		System.out.println("b) 63");
		System.out.println("c) 64");
		System.out.println("d) 65");
		System.out.println("---------------------------------------------------------------------------------------------------------");		
		
		System.out.println("3. If ‘M’ is written as ’13’ in a certain code, how will ‘LION’ be written in the same code?");
		System.out.println("a) 12247");
		System.out.println("b) 12346");
		System.out.println("c) 13247");
		System.out.println("d) 13347");
		
		responses[0] = sc.next();
		responses[1] = sc.next();
		responses[2] = sc.next();
		
		int score = 0;
		for(int i=0; i<3; i++) {

			if(responses[i].equalsIgnoreCase(answers[i])) {
				score++;
			}
		}
		System.out.println("Score :" +score+ "/3");
	}

}
