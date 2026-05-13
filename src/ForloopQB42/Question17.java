package ForloopQB42;

public class Question17 {
	public static void main(String[] args) {
		int n = 1234;
		
		int result = 0;
		
		for(int i = 0 ; n > 0 ; i++) {
			
			int last = n%10;
			
			
			result = result*10 + last;
			
			n = n/10;

			
		}
		System.out.println(result);
				
	}

}