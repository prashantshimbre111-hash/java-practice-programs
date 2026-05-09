package Stringusingforloop;

public class Question4 {
	public static void main(String[] args) {
		
	
	
	String s  ="m a h a r a s h t r a";
	
	int count = 0;
	
	for(int i = 0 ; i< s.length() ; i++ ) {
		
		char c = s.charAt(i);
		
		if(c == ' ') {
			count++;
		}
	}
	System.out.println(count);

}
}