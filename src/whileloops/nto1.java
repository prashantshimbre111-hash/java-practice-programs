package whileloops;

import java.util.Scanner;

public class nto1 {
	public static void main(String[] args) {
//		 Print numbers in reverse from n to 1 (user input). 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("please enter number here : ");
		 int n = sc.nextInt();
		 
		 int i = n;
		 while(i>0) {
			 System.out.println(i);
			 i--;
		 }
	}

}
