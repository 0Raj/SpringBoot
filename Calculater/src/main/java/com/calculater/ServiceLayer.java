package com.calculater;

public class ServiceLayer {
	
	private int a;
	private int b;
	
	private Calculation operation;
	
	public void doCalculation() {
		System.out.println(this.operation.calculate(a, b));
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Calculation getOperation() {
		return operation;
	}

	public void setOperation(Calculation operation) {
		this.operation = operation;
	}
	
}
