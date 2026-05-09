package ForloopQB42;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter input ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			
			if(i%2==1) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
