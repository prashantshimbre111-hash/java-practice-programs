package Twoclass;

public class suraj {

	public String getuser(String fname, String lname , int yob) {
		
		int year  = yob%100;
		
		String username = fname+lname+year;
		return username;
		
		
	}
}
