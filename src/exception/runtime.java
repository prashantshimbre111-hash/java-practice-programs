package exception;

import java.util.Scanner;

public class runtime {
	
	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
		try {System.out.println("please enter a : ");
		int a = sc.nextInt();
		
		System.out.println("please enter b : ");
		int b = sc.nextInt();
		
		System.out.println(a/b);}
		catch(ArithmeticException e) {
			System.out.println("please do not '0' as input ");
			
		}
		}
	}

}
