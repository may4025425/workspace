package edu.fju.exam;

public class Employee {
	int amount ;
	int bonus = 5000;
	int bonus2 = 3000;
	
	public Employee(String string, int amount) {
		
		this.amount = amount;
	}
	
	public void print() {
		
		System.out.println( "Jack" +"\t"+amount );
		System.out.println( "Mary" +"\t"+amount );
		System.out.println( "Danny"+"\t"+amount );
	}
}
