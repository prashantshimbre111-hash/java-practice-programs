package exception.throws1;

public class Test {
	
	public static void main(String[] args) {
		
		division d = new division();
		try{d.div(12, 0);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException found");
		}
		}
		
	}


