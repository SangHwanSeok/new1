package loops;
import java.util.Scanner;
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int su;
		byte number;
		while(true) {
			su = (int)(Math.random()*3)+1;
			System.out.println("���ڸ� �Է��ϼ���");
			number = scan.nextByte();
			if(su == 1) {
				System.out.println("��ǻ�� : ����");
				if(number == 1) {
				System.out.println("Draw");
				}
				else if(number == 2) {
					System.out.println("u win!");
				}
				else if(number == 3) {
					System.out.println("u lose");
				}
				else {
					System.out.println("break");
					break;
				}
			}
			if(su == 2) {
				System.out.println("��ǻ�� : ����");
				if(number == 1) {
				System.out.println("u lose");
				}
				else if(number == 2) {
					System.out.println("draw!");
				}
				else if(number == 3) {
					System.out.println("u win");
				}
				else {
					System.out.println("break");
					break;
				}
			}
			if(su == 3) {
				System.out.println("��ǻ�� : ��");
				if(number == 1) {
				System.out.println("u win");
				}
				else if(number == 2) {
					System.out.println("u lose!");
				}
				else if(number == 3) {
					System.out.println("draw");
				}
				else {
					System.out.println("break");
					break;
				}
			}
		}
	}
}
