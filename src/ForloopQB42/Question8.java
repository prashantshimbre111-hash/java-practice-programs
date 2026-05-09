package ForloopQB42;

import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		
		System.out.println("please enter number ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			
			if(i % 5 == 0) {
				
				continue;
				
			}
		
		System.out.println(i);
		}
	
	}

}
