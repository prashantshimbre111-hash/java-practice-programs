package ForloopQB42;

public class Question19 {
	public static void main(String[] args) {
		
		int s = 294543;
		int max = 0;
		
		for(int i = 0 ; s > 0 ; i++) {
			
			int last = s % 10;
			
			if(last>max) {
				max = last;
			}
			s = s/10;
			
		}
		System.out.println("max number : " + max);
	}
	

}
