package ifelse;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		
	while(true) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
	
		
		if(marks >=35 && marks <=49) {
			System.out.println("E grade");
		}
		else if (marks >= 50 && marks <= 59) {
			System.out.println("D Grade");
		}
		else if (marks >= 60 && marks <= 69) {
			System.out.println("C Grade");
		}
		else if (marks >=70 && marks <= 79) {
			System.out.println("B Grade");
		}
		else if (marks >= 80 && marks <=89) {
			System.out.println("A grade");
		}
		else if (marks >= 90 && marks <= 100) {
			System.out.println("A+ Grade");
		}
		else {
			System.out.println("please enter propper number");
		}
		sc.close();
		
	}
	

}}
