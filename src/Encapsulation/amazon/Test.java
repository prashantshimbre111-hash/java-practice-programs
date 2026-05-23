package Encapsulation.amazon;

public class Test {
	public static void main(String[] args) {
		
		amazon a = new amazon();
		
		a.setId("prashant@amazon");
		String id = a.getId();
		System.out.println("id : " + id);
		
		a.setPassword("pras1234");
		String password = a.getPassword();
		System.out.println("password : " + password);
		
		
		flipkart f = new flipkart();
		
		f.setId("212332ddsd");
		String i = f.getId();
		System.out.println("id : "+ i);
		
		f.setPass("bedvhby23975");
		String pass = f.getPass();
		System.out.println("pass : " + pass);
		
		Myntra m = new Myntra();
		
		m.setRollno(101);
		int  roll= m.getRollno();
		System.out.println(roll);
		
		m.setName("prashantshimbare");
		String name = m.getName();
		System.out.println(name);
	}	
	

}
