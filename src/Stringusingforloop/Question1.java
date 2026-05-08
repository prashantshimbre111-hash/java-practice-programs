package Stringusingforloop;

public class Question1 {

	public static void main(String[] args) {
		
		String st = "aeiou";
		
		int count = 0;
		
		
		String str = st.toLowerCase();
		
		for(int i = 0 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				
				count++;
				
			}
		
		
		}
		System.out.println(count);
		
		
		
	}
}
