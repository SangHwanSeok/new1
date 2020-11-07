package Method;

import java.util.Scanner;

public class MethodDemo {
	
	public static void numbering() {
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
	public static void Str(String str) {
		System.out.println(str.charAt(3));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		numbering();
		Str(str);
	}

}
