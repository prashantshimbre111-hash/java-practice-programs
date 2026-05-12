package Stringusingforloop;

public class Question13 {
	
	public static void main(String[] args) {
		
		String s = "prashant123123";
		String extract = "";
		
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
			if(Character.isDigit(c)) {
				
				extract = extract + c;
				
			}
		}
		System.out.println(extract);
	}

}
