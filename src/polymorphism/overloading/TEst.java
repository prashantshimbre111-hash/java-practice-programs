package polymorphism.overloading;

public class TEst {

	public static void main(String[] args) {
		
		measure m = new measure();
		
		m.cal(11, 211);
		m.cal("rutwik gawande");
		m.cal(12, "prashant shimbare" , 123.432 , 433f , 'w');
	}
}
