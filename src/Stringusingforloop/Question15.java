package Stringusingforloop;

public class Question15 {
	
	public static void main(String[] args) {
		
		String s = "prashant";
		int sum = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
			sum = sum + Character.hashCode(c);
			
		}
		System.out.println(sum);
		
		
	}

}
