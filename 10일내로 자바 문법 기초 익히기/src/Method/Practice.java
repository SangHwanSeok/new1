package Method;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		System.out.println(word);
		String str = "apple";
		String[] arr_word;
		arr_word = str.split("");
		System.out.println(arr_word); // аж╪р
		for(int i =0;i<5;i++) {
			System.out.println(arr_word[i]);
		}
	}

}
