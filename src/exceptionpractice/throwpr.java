package exceptionpractice;

public class throwpr {
	
	public static void main(String[] args) {
		
		int a = 12;
		
		if(a%2==0) {
			throw new ArithmeticException("this is bad number");
		}
		else {
			System.out.println("this is good number");
		}
		
	}

}
