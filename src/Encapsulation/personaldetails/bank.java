package Encapsulation.personaldetails;

public class bank {
	
	private String bankname;

	private String accountnumber;

	private String ifsccode;
	
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankname() {
		return bankname;
	}
	
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	public String getAccountnumber() {
		return accountnumber;
	}
	
	public void setIfsccode(String ifsccode) {
	this.ifsccode = ifsccode;
	}
	public String getIfsccode() {
		return ifsccode;
	}

}
