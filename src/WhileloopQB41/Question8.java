package WhileloopQB41;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		
//		. Print the cube of all numbers from 1 to n (user input).
		
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter number : ");
			int n = sc.nextInt();

			int i = 1;
			while(i <= n) {
				System.out.println("cube of " + i + ": " + i*i*i);
				i++;
			}
	}

}
