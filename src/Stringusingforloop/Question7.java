package Stringusingforloop;

public class Question7 {
	public static void main(String[] args) {
		
		String s = "p r a s h a n t";
		
		String result = "";
		
		for(int i = 0; i <= s.length()-1 ; i++) {
			
			char c = s.charAt(i);
			if(c != ' ') {
				result = result+c;
			}
			
			
		}
		System.out.println(result);
	}

}
