package whileloops;

import java.util.Scanner;

public class Cubenum {

	public static void main(String[] args) {
//		6. Print cubes of numbers from 1 to n .

		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number here : ");
		int n = sc.nextInt();
		
		int i =1;
		while(i<=n) {
			System.out.println(i*i*i);
			i++;
		}
	}
}
