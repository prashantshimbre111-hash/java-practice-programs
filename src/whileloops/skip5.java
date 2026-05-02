package whileloops;

import java.util.Scanner;

public class skip5 {
	public static void main(String[] args) {
//		8. Print numbers from 1 to n but skip multiples of 5.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number here : ");
		int n = sc.nextInt();
		
		int i = 1;
		while(i<=n) {
			
			if(i%5==1) {
				System.out.println(i);
			}
			
			i++;
		}

	}

}
