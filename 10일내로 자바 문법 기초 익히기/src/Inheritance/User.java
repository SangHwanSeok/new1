package Inheritance;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CalculatorMk2 c1 = new CalculatorMk2();
		int a = sc.nextInt();
		int b = sc.nextInt();
		c1.set(a, b);
		System.out.println(c1.avg()+" "+c1.sub()+" "+c1.sum()+" "+c1.times());
	}

}
