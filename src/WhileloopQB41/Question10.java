package WhileloopQB41;

import java.util.Scanner;

public class Question10 {
	
	public static void main(String[] args) {
		
//		. Print the first n even numbers.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number : ");
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			
			if(i % 2 == 0) {
				
				System.out.println(i);
			}
			i++;
		}
	}

}
