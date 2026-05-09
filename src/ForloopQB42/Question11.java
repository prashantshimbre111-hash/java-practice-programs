package ForloopQB42;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter input");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i <= n ; i++) {
			
			sum = sum+i;
			
			
		}
		System.out.println(sum);
		
	}

}
