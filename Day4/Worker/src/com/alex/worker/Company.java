package com.alex.worker;

public class Company {

	public static void main(String[] args) {
		
		Worker alex = new DailyWorker("Alex", 10);
		Worker sujata = new SalariedWorker("Sujata", 10);
		
		System.out.println(alex.Pay(10));
		
		System.out.println(sujata.Pay(10));

	}

}
