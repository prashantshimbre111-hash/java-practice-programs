package WhileloopQB41;

import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("please enter number : ");
	int n = sc.nextInt();
	
	int fact = 1;
	
	int i = 1;
	while(i <= n) {
		
		fact = fact*i;
		i++;
	}
	System.out.println(fact);
		
		
	}

}
