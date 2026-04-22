package scanner;

import java.util.Scanner;

public class total {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter a");
		 int a = sc.nextInt();
		 System.out.println("pleae enter b");
		 int b = sc.nextInt();
		 
		 int total = a+b;
		 
		 System.out.println("a+b : " + total);
	}

}
