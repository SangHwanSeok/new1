package operator;

public class DivisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); //3
		System.out.println(c/d); //3.333333 암시적 형변환 실수가 정수로
		System.out.println(a/d); //3.333333 암시적 형변환 정수가 실수로
	}

}
