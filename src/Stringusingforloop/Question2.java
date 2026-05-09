package Stringusingforloop;

public class Question2 {
	public static void main(String[] args) {
		
		String s = "shdhhrteydhwy";
		int count  = 0;
		
		String str = s.toLowerCase();
		
		for(int i = 0; i<str.length() ; i++) {
			
			char c = str.charAt(i);
			
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' ) {
				
				c++;
			}
		}
		System.out.println(count);
	}

}
