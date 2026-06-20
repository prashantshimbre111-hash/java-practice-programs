package arithmaticexxeption;

public class Test {

	public static void main(String[] args) {
		try {
			int a = 12;
			int b = 4;

			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("please do not enter '0' as input");
		}

		System.out.println("program ended");
	}

}
