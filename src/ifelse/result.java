package ifelse;

public class result {
	
	public static void main(String[] args) {
		
		int marks = 85;
		
		if(marks >= 35) {
			if(marks >=75) {
				System.out.println("pass with distinction");
			}
			else {
				System.out.println("pass");
			}
		}
		else {
			System.out.println("fail");
		}
	}

}
