package WhileloopQB41;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number : ");
		int number = sc.nextInt();
		
		int count = 0;
		
		int i = 0;
		while(number>0) {
			
		
			number = number/10;
			count++;
			i++;
			
		}
		System.out.println("digit count : " + count);
	}
}
