package Stringusingforloop;

public class Question6 {
	public static void main(String[] args) {
		
		String s = "maharashtra";
		
		for(int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			System.out.println(c);
		}
	}

}