package ForloopQB42;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number");
		int n = sc.nextInt();
		
		for(int i = 0 ; i <= n ; i++) {
			
			System.out.println(i*i*i);
		}
	}

}
