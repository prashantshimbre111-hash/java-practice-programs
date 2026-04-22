package Twoclassvariable;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter a :");
		int a = sc.nextInt();

		System.out.println("please enter b :");
		int b = sc.nextInt();

		int div = a / b;
		System.out.println("division of a and b : " + div);
	}

}
