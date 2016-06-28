package com.sapient.beans;

public class Camera extends Product{
	
	private String lens;

	public Camera(int pid, String pname, double price, String lens) {
		super(pid, pname, price);
		this.lens = lens;
	}
	
	public String isExpensive() {
		if (getPrice() >= 10000)
			return "Expensive";
		else
			return "Average";

	}
	
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return super.display()+ " " +lens;
	}
}
