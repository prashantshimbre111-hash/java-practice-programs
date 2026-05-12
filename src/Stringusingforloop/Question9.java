package Stringusingforloop;

public class Question9 {
	
	public static void main(String[] args) {
		
		String s = "aswedASWQndfnQWSA";
		
		String aa  ="";
		
		for(int i = 0 ; i<s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(c >= 'A' && c<= 'Z') {
				aa = aa+ Character.toLowerCase(c);
			}
			else if(c>='a' && c<= 'z') {
				
				aa = aa+ Character.toUpperCase(c);
				
			}
			
			
		}System.out.println(aa);
	}

}
