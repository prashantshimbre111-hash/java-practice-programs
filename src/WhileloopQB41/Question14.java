package WhileloopQB41;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number : ");
		int number = sc.nextInt();
		
		int count = 0;
		
		int i = 1;
		while(number>0) {
			
		
			
			count++;
			number = number/10;
			i++;
			
		}
		System.out.println("digit count : " + count);
	}
}
