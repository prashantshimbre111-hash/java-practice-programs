package Encapsulation.snapdeal;

public class snapdeal {
	
	private int id;
	
	private String password;
	
	private bankdetails bank;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	public void setBank(bankdetails bank){
		this.bank = bank;
	}
	public bankdetails getBank() {
		return bank;
	}

}
