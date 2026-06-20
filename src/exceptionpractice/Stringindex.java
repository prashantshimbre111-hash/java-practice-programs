package exceptionpractice;

public class Stringindex {
	public static void main(String[] args) {
		
	try {	String s = "prashant";
		
		System.out.println(s.charAt(11));}
	catch (StringIndexOutOfBoundsException e) {
		System.out.println("StringIndexOutOfBoundsException found");
	}
	System.out.println("program ended");
		
	}

}
