package conditionalstatement;

public class elseif {
	
	public static void main(String[] args) {
		
		String s = "prs";
		
		if(s=="white") {
			System.out.println("white");
		}
		else if(s=="green"){
			System.out.println("it is not white");
		}
		else if (s=="red") {
			System.out.println("it is red");
		}
		else {
			System.out.println("it is colourless");
		}
	}

}
