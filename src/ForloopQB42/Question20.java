package ForloopQB42;

public class Question20 {
	public static void main(String[] args) {
		int s = 32342345;
		int min = 9;
		
		for(int i = 0 ; s > 0 ; i++) {
			
			int last = s % 10;
			
			if (last < min) {
				min = last;
			}
			s = s/10;
		}
		
		System.out.println("minimum number : " + min);
	}

}
