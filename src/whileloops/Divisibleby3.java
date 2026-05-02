package whileloops;

public class Divisibleby3 {
	public static void main(String[] args) {
		
//		Print all numbers divisible by 3 between 1 and 30.
		System.out.println("below are the numbers which are divisible by 3 : ");
		
		int i = 1;
		while (i<=30) {
			if(i%3==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
