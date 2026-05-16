package arraywithencapsulation;

public class testcustomer{

	public static void main(String[] args){
	
		customer c = new customer();
		c.setId(101);
		c.setName("prashant nandkishor shimbare");
		c.setCity("pune");
		c.setProduct("dell laptop");
		c.setPrice(32500); 
		c.setDate("12-03-2026");
		
		customer c1 = new customer();
		c1.setId(102);
		c1.setName("sagar navin chauhan");
		c1.setCity("mumbai");
		c1.setProduct("macbook air");
		c1.setPrice(42000); 
		c1.setDate("12-01-2026");
		
		customer c2 = new customer();
		c2.setId(103);
		c2.setName("pratik vinay shinde");
		c2.setCity("banglore");
		c2.setProduct("samsung mobile");
		c2.setPrice(12500); 
		c2.setDate("07-06-2026");		
		customer[] array = {c , c1  ,c2};
		
		for(int i = 0 ; i < array.length ; i++){
		
				customer v = array[i];
				System.out.println("Customer details : ");
				System.out.println(v.getId());
				System.out.println(v.getName());
				System.out.println(v.getCity());
				System.out.println(v.getProduct());
				System.out.println(v.getPrice());
				System.out.println(v.getDate());
				System.out.println("");
	}



}}