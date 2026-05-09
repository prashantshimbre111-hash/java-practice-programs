
package Stringusingforloop;

public class Question5 {

	public static void main(String[] args) {

		String s = "maharaSHTRA";

		int uppercount = 0;
		int lowercount = 0;
		

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {

				uppercount++;

			}
			if(Character.isLowerCase(c)) {
				
				lowercount++;
			}

		}
		System.out.println("uppercount : " + uppercount);
		System.out.println("lowercount : " + lowercount);
}}	
	
	
	


