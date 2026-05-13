package WhileloopQB41;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		
//		Find the sum of odd numbers between 1 and n .
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		int i = 0;
		while(i <= n) {
			if(i % 2 == 1) {
				sum = sum + i;
			}i++;
		}System.out.println("sum of all odd numbers from 1 to " + n + ": " + sum);
	}

}
