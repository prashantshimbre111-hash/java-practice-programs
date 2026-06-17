package returnmethod;

public class employee {
	
	public int getsalary() {
		
		int salary = 55000;
		
		return salary;
		
	}
	
	public int getpackage(int sal, int month) {
		int p = sal*month;
		return  p;
	}

}
