package Stringusingforloop;

public class Question10 {
	
	public static void main(String[] args) {
		
		String s = "aba";
		
		String result = "";
		
		for(int i = s.length()-1 ; i >= 0; i--) {
			
			char c = s.charAt(i);
		
			result = result + c;
		}
		System.out.println(result);
		
		if(s.equals(result)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	} 
	

}
