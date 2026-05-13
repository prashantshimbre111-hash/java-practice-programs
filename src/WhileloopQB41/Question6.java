package WhileloopQB41;

public class Question6 {
	
	public static void main(String[] args) {
		
//		. Print all numbers divisible by 5 between 1 and 100.

		int i = 1;
		while(i <= 100) {
			
			if(i%5==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
