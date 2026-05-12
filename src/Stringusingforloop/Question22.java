package Stringusingforloop;

public class Question22 {
	
	public static void main(String[] args) {
		
		String s = "prashant nandkishor shimbare";
		
		String result = "";
		
		for (int i = 0 ; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
			if(i == 0 || s.charAt(i - 1) == ' ') {
				
				result = result + Character.toUpperCase(c);
				
			}
			else {
				result = result + c;
			}
			
		}
		System.out.println(result);
		
	}

}
 