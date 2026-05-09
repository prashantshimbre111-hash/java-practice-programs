package ForloopQB42;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter input");
		int n = sc.nextInt();
		int count = 0;
		
	for(; n != 0 ; n = n/10) {
		
		count++;
		
	}
	System.out.println(count);
	
	
	}

}
