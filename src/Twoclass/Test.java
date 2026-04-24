package Twoclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Username u = new Username();
		String getuser = u.user("prashant" , "shimbare" , 1998);
		System.out.println();
		System.out.println("username : " + getuser);
		
		rohan r = new rohan();
		String getusername = r.generator("rohan", "shimbare", 2001);
		System.out.println();
		System.out.println("rohan's username : " + getusername);
		
		vishwa v = new vishwa();
		String get = v.username("vishwa", "ingle",2003);
		System.out.println();
		System.out.println("vishwa username : " + get);
		
		suyash s = new suyash();
		String userem = s.user("suyash" , "dhajekar" , 1991);
		System.out.println();
		System.out.println("suyash username : " + userem);
		
		priya p = new priya();
		String userpriya = p.username("priya" , "solanki" , 1998);
		System.out.println();
		System.out.println("username of priya is generated : " + userpriya);
		
		gura g = new gura();
		String offid = g.id("guru", "patil", 1998);
		System.out.println(" official id by using returntype parameterized method : " + offid);
		
		
		

	}

}
