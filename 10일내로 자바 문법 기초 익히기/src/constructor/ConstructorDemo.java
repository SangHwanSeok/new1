package constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator(3,7);
		c1.sum();
		c1.avg();
	}

}
class Calculator{
	int left, right;
	public Calculator(int left, int right){
		this.left = left;
		this.right = right;
	}
	public int sum() {
		System.out.println(this.left + this.right);
		return this.left + this.right;
	}
	public void avg() {
		int result = sum();
		System.out.println(result/2);
	}
}
