package compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello World";
		String b = new String("Hello World"); //아직은 몰라도 되요
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

}
