package exceptionpractice;

public class abctointeger {
	public static void main(String[] args) {
		
	try {	String s = "qwerty";
		
		System.out.println(Integer.parseInt(s));}
	catch(NumberFormatException e) {
		System.out.println("Please enter a valid number");
	}
	System.out.println("pragram ended");
		
		
	}

}
