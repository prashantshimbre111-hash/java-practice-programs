package scanner;

import java.util.Scanner;

public class Modules {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pleae enter a : ");
		int a = sc.nextInt();
		
		System.out.println("please enter b : ");
		int b = sc.nextInt();
		
		int mod = a%b;
		System.out.println("mod of a and b : " + mod);
		
	}

}
