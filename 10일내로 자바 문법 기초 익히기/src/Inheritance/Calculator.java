package Inheritance;

public class Calculator {
	int a,b;
	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return this.a+this.b;
	}
	public float avg() {
		return sum()/2;
	}
}
