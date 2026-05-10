package ds_6;

import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class ass6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of processes : ");
		
		int n = scanner.nextInt();
		
		int token = 0;
		
		while(true) {
			System.out.println("Token is with process : "+ token);
			System.out.println("Does process" + token + " wants tp enter in CS");
			
			
			int choice = scanner.nextInt();
			
			if (choice == 1) {
				System.out.println("Process "+ token + "is in Critical scetions");
				System.out.println("Process "+ token + "is in exiting scetions");
			}
					
			token = (token+1)%n;
			System.out.println("Continue (0/1)");
			
			int cont = scanner.nextInt();
			if(cont == 0) {
				break;
			}
			
		}
	}
}
