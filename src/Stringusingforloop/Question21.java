package Stringusingforloop;

public class Question21 {
	public static void main(String[] args) {
		
		String s = "pra sha nt";
		
		String hyphen = "";
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
			if(Character.isSpaceChar(c)) {
				
				hyphen = hyphen + '-';
			}
			else {
				
				hyphen = hyphen + c;
			}
				
			}
		
			
		
		System.out.println(hyphen);
	}

}
