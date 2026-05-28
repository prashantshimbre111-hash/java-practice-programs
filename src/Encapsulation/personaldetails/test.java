package Encapsulation.personaldetails;

public class test {
	
	public static void main(String[] args) {
		
		educational e = new educational();
		e.setCollegename("iit bobay");
		e.setFeild("cs");
		e.setPassoutyear("2020");
		
		bank b = new bank();
		b.setBankname("hdfc bank");
		b.setAccountnumber("1234589");
		b.setIfsccode("ifsc3213");
		
		from f = new from();
		f.setId(100);
		f.setName("prashant shimbare");
		f.setCity("pune");
		f.setB(b);
		f.setE(e);
		
		System.out.println(f.getId());
		System.out.println(f.getName());
		System.out.println(f.getCity());
		System.out.println("Bank Details : ");
		System.out.println(f.getB().getBankname());
		System.out.println(f.getB().getAccountnumber());
		System.out.println(f.getB().getIfsccode());
		System.out.println("Educaional Details : ");
		System.out.println(f.getE().getCollegename());
		System.out.println(f.getE().getFeild());
		System.out.println(f.getE().getPassoutyear());
	}

}
