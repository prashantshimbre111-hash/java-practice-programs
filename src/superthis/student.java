package superthis;

public class student extends school {
	
	public student() {
		super();
		
		
	}
	
	public student(String name) {
		super("prashant");
		System.out.println("");
	}
	
	public int id = 2201;
	
	public void getby() {
		System.out.println("***************student");
		System.out.println(this.id);
		System.out.println(super.id);
		super.getby();
	
	}
	
	

}
