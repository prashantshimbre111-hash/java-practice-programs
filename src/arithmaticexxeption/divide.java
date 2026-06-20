package arithmaticexxeption;

public class divide {
	
	public static void main(String[] args) {
		try {

			int a = 16;
			int b = 0;
			
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("Please don't divide by zero");
		}
		
		System.out.println("program ended");
	}

}
