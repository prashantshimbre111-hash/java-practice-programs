package ForloopQB42;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter input");
		int n = sc.nextInt();
		sc.close();
		
		int count = 0;
		int sum = 0;
		
		for (; n != 0 ; n = n/10) {
			
			count++;
			sum = count + sum;
		}
		System.out.println(sum);
	}

}
