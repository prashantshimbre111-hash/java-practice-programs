package scanner;

import java.util.Scanner;

public class mesurements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter a :");
		int a = sc.nextInt();
		System.out.println("please enter b :");
		int b = sc.nextInt();
		int addition = a + b;
		System.out.println("Addition of a and b : " + addition);
		
		int subtraction = a-b;
		System.out.println("Subtraction of a and b : " + subtraction);
		
		int multiplication = a*b;
		System.out.println("multiplication of a and b : " + multiplication);
		
		int division = a/b;
		System.out.println("division of a and b : " + division);
		
		int modules = a%b;
		System.out.println("mod of a and b : " + modules);
		

	}
}