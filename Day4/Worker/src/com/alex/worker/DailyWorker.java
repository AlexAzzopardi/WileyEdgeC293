package com.alex.worker;

public class DailyWorker extends Worker {
	
	public DailyWorker(String name, int salaryRate) {
		super(name, salaryRate);
	}
	
	@Override
	public int Pay(int hours) {
		System.out.print(super.getName() + " worked " + hours + " this week at £" + super.getSalaryRate()+ " an hour and earned £");
		return hours*super.getSalaryRate();
	}

}
