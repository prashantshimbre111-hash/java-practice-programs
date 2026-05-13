package ForloopQB42;

public class Question18 {
	public static void main(String[] args) {
		
		int s = 1234;
		
		int result = 1;
		
		for(int i = 0 ; s > 0 ; i ++) {
			
			int last = s%10;
			result = result*last;
			s = s/10;
		}
		System.out.println(result);
	}

}
