package conditionalstatement;

public class nested {
	public static void main(String[] args) {
		
		String s = "red";
		
		if(s=="green") {
			System.out.println("it is green colour");
			if(s=="blue") {
				System.out.println("it is blue colour");
				
			}
			if(s=="red") {
				System.out.println("it is red colour");
			}
		}
		else {
			System.out.println("it is colourless");
		}
	}

}
