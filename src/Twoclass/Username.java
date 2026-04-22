package Twoclass;

public class Username {
	
	public String user(String fname , String lname , int yob) {
	
		int year = yob%100;
		
		String join = fname + lname + year;
		return join;
	}

}
