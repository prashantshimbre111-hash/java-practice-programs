package Twoclass;

public class priya {
	
	public String username(String fname , String lname , int yob) {
		
		int year = yob%100;
		
		String add = fname + lname + year;
		return add;
		
		
	}

}
