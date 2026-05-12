package Stringusingforloop;

public class Questinon12 {
	public static void main(String[] args) {
		
		String s = "Prashant12345677890";
		String result = "";
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
			if (Character.isDigit(c) ) {
				result = result + '#';
				
			}
			else {
				result = result + c;
			}
		}
		System.out.println(result);
	}

}
