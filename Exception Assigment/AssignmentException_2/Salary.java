package com.yash.AssignmentException_2;

public class Salary {
	private double da;
	private double pf;
	private double insent;
	
	public void calculateTotal(int bas) {
		da=0.90*bas;
		pf=0.20*bas;
		insent=0.10*bas;
		double total=(bas+da+pf+insent);
		
		System.out.println("Basic Salary:"+bas);
		System.out.println("DA:-"+da);
		System.out.println("PF:-"+pf);
		System.out.println("Insent:-"+insent);
		
	}

}
