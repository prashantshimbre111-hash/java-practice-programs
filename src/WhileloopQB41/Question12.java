package WhileloopQB41;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {

//		. Find the sum of even numbers between 1 and n .

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter number : ");
		int n = sc.nextInt();
		int sum = 0;

		int i = 1;
		while (i <= n) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

			i++;

		}
		System.out.println("sum of all even numbers from 1 to " + n + ": " +  sum);

	}

}
