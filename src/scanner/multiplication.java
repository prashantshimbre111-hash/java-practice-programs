package scanner;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter a");
		int a = sc.nextInt();
		System.out.println("pleae enter b");
		int b = sc.nextInt();
		
		int mul = a*b;
		System.out.println("multiplication of a and b : " + mul);

	}

}
