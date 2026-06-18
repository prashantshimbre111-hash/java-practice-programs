package HasA;

public class Student {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getStanderd() {
		return standerd;
	}
	public void setStanderd(String standerd) {
		this.standerd = standerd;
	}
	public bankdetails getB() {
		return b;
	}
	public void setB(bankdetails b) {
		this.b = b;
	}
	private String fullname;
	private String standerd;
	private bankdetails b;
	

}
