package HasA;

public class Test {
	public static void main(String[] args) {
		
		
		bankdetails b = new bankdetails();
		
		b.setBankname("axis bank");
		b.setAcnumber("1234679");
		
		Student s = new Student();
		
		s.setId(55);
		s.setFullname("prashant nandkishor shimbare");
		s.setStanderd("10th A");
		s.setB(b);
		
		System.out.println(s.getId());
		System.out.println(s.getFullname());
		System.out.println(s.getStanderd());
		System.out.println(s.getB().getBankname());
		System.out.println(s.getB().getAcnumber());
		
		
		
	}

}
