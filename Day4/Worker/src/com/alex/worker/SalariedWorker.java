package com.alex.worker;

public class SalariedWorker extends Worker {

	public SalariedWorker(String name, int salaryRate) {
		super(name, salaryRate);
	}

	@Override
	public int Pay(int hours) {
		System.out.print(super.getName() + " worked " + hours + " this week at £" + super.getSalaryRate()+ " an hour and earned £");
		return 40*super.getSalaryRate();
	}

}
