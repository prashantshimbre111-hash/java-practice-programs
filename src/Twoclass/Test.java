package Twoclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Username u = new Username();
		String getuser = u.user("prashant" , "shimbare" , 1998);
		System.out.println("username : " + getuser);
		
		rohan r = new rohan();
		String getusername = r.generator("rohan", "shimbare", 2001);
		System.out.println("rohan's username : " + getusername);
		
		vishwa v = new vishwa();
		String get = v.username("vishwa", "ingle",2003);
		System.out.println("vishwa username : " + get);
		
		
		

	}

}
