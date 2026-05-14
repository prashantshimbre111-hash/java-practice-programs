package Arrayobject;

public class Teststring {
	public static void main(String[] args) {
		
		field f = new field();
		f.id = 101;
		f.fname = "prashant";
		f.lname = "shimbare";
		f.education = "software test engineer";
		f.email = "prashantshimbre111@gmail.com";
		f.mobile = 12345678;
		
		field f1 = new field();
		f1.id = 102;
		f1.fname = "rohan";
		f1.lname = "shimbare";
		f1.education = "civil engineer";
		f1.email = "rohanshimbre1768@gmail.com";
		f1.mobile = 123232446;
		
		field[] studentinfo = {f , f1};
		
		for(int i = 0 ; i < studentinfo.length ; i++) {
			
			field si = studentinfo[i];
			System.out.println(" ");
			System.out.println(si.id);
			System.out.println(si.fname);
			System.out.println(si.lname);
			System.out.println(si.education);
			System.out.println(si.email);
			System.out.println(si.mobile);
		}
				
		
	}
}
	
	
