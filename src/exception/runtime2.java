package exception;

public class runtime2 {

	public static void main(String[] vishwa) {

		int a = 10;
		int b = 0;

		String s = null;

		try {
			System.out.println(s.length());

		} catch (NullPointerException e) {
			System.out.println("nullpointer exception found");
		}
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("compile time exception found");
		}

	}
}
