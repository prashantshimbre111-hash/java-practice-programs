package scanner;

import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value here : ");
		int a = sc.nextInt();
		System.out.println("enter value here : ");
		int b = sc.nextInt();
		
		int output = a+b;
		System.out.println("output by using scanner : " + output);
	}
}
