package whileloops;

public class OddIfElse {

	public static void main(String[] args) {
//		Print odd numbers from 1 to 50 with if else condition.

		System.out.println("below list is odd number from 1 to 50 : ");

		int i = 1;
		while (i <= 50) {

			if (i % 2 == 1) {

				System.out.println(i);
			}
			i++;
		}
	}

}
