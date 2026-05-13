package WhileloopQB41;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {

//		 . Find the sum of digits in a given number

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter number : ");
		int number = sc.nextInt();

		int count = 0;
		int sum = 0;

		int i = 1;
		while (number > 0) {

			count++;

			number = number / 10;
			sum = sum+ count;
			i++;
		}
		System.out.println("sum of digit of numbers from 1 to " + number + ": " + sum);
	}

}
