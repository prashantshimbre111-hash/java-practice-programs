package Stringusingforloop;

public class Question11 {
	public static void main(String[] args) {
		
		String s = "prashant";
		
		int count = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
			if(c=='a') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
