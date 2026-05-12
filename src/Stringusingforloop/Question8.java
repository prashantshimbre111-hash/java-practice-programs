package Stringusingforloop;

public class Question8 {

	public static void main(String[] args) {
		
		String s = "abcsedfgdfghkll";
		
        String aa = "";
		
		//using method
//		String result = str.replace('a', '*')
//				.replace('e', '*')
//				.replace('i', '*')
//				.replace('o', '*')
//				.replace('u', '*');
//		System.out.println(result);
		
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
		if(c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			aa = aa+ '*';
		 
		}
		else {
			aa = aa+c;
		}
			
			
			
					
		}					System.out.println(aa);

	}
}
