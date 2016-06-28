package com.sapient.beans;

public class Computer extends Product {

	private String mBoard;

	public Computer(int pid, String pname, double price, String mBoard) {
		super(pid, pname, price);
		this.mBoard = mBoard;
	}

	public String isExpensive() {
		if (getPrice() >= 40000)
			return "Expensive";
		else
			return "Average";

	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return super.display()+ " " + mBoard;
	}
	
}
