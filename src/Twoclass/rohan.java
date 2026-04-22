package Twoclass;

public class rohan {
	
	public String generator(String fname , String lname , int yob) {
		
		int year = yob%100;
		
		String username = fname + lname + year;
		return username;
	}
	

}
