package edu.fju.exam;

public class Manager extends Employee{

	public Manager(String string, int amount) {
		super(string, amount);
		
	}
	@Override
	public void print() {
		int bonus = 5000;
		System.out.println("Eddie"+"\t"+amount +"\t"+ +bonus);
		System.out.println("Andy"+"\t"+amount +"\t"+ +bonus);
	}
	
}
