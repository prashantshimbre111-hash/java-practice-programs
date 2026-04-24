package Twoclass;

public class gura {
	
	public String id(String fname , String lname , int yr){
		
		int yob = yr%100;
	
	String offid = fname + lname + yob;
	return offid;

}}
