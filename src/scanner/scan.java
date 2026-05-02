package scanner;

import java.util.Scanner;

public class scan {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first input");
		int a = sc.nextInt();

		System.out.println("enter second value");
		int b = sc.nextInt();

		int total = a + b;

		System.out.println("addition by using scanner class : " + total);

	}

}
