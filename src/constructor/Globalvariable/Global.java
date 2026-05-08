package constructor.Globalvariable;

public class Global {

	public String city;
	public int id;
	
	public void printdetails(String city , int id) {
		
		this.city = city;
		this.id = id;
		
		
	}
	
	public void sysoprint() {
		
	System.out.println("city : " + city);
	System.out.println("id : " + id);
	}
	
}
