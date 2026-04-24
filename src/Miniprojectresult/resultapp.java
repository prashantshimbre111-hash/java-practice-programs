package Miniprojectresult;

public class resultapp {

	public static void main(String[] args) {
		
		prashantmarksheet p = new prashantmarksheet();
		
		int prashantmark = p.math + p.eng + p.sci;
		int totalmark = p.engtotal + p.mathtotal + p.scitotal;
		
		int result = (prashantmark*100)/totalmark;
		System.out.println("result : " + result);
	}
}
