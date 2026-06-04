package Encapsulation.pune;

public class Test {
	
	public static void main(String[] args) {
	
	rera r = new rera();
	r.setRerahead("prashant shimbare");
	r.setReravp("rohan patil");
	
	pmc p = new pmc();
	p.setPmchead("nandkishor patil");
	p.setPmcvp("padmini shimbare");
	p.setR(r);
	
	System.out.println(p.getPmchead());
	System.out.println(p.getPmcvp());
	System.out.println(p.getR().getRerahead());
	System.out.println(p.getR().getReravp());
	
	
	
	
	
}}
