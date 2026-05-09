package ForloopQB42;

import java.util.Scanner;

public class cubento1 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number");
		int n = sc.nextInt();
		
		for(int i = n ; i > 0 ; i--) {
			
			System.out.println(i*i*i);
		}
		
		
	}

}
