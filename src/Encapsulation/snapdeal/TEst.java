package Encapsulation.snapdeal;

public class TEst {
	
	public static void main(String[] args) {
		
		bankdetails b = new bankdetails();
		b.setAcc(256548934);
		b.setIfsc("icici0000");
		
		snapdeal s = new snapdeal();
		s.setId(0031);
		s.setPassword("pune@2021");
		s.setBank(b);
		
		System.out.println("branch ID : " + s.getId());
		System.out.println("snapdeal password : " + s.getPassword());
		System.out.println("account number : " + s.getBank().getAcc());
		System.out.println("ifsc code : " + s.getBank().getIfsc());
		
	}

}
