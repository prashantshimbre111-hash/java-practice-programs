package WhileloopQB41;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {

//		. Find the sum of numbers from 1 to n .

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter number : ");
		int n = sc.nextInt();

		int sum = 0;

		int i = 1;
		while (i <= n) {

			sum = sum + i;

			i++;
		}
		System.out.println("sum of numbers from 1 to " + n +" : "+ sum);

	}

}
