package whileloops;

import java.util.Scanner;

public class Squarenum {
	public static void main(String[] args) {
//		Print squares of numbers from 1 to n (user input)

		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number here : ");
		int n = sc.nextInt();
		
		
		int i = 1;
		while (i <= n) {
			System.out.println(i*i);
			i++;
		}
	}

}
