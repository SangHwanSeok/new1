public class InstanceMemberEx03 {
	String year;
	String month;
	String day;

	public InstanceMemberEx03(String year) {
		this(year, null, null);
	}

	public InstanceMemberEx03(String year, String month) {
		this(year, month, null);
	}

	public InstanceMemberEx03(String year, String month, String day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public static void main(String[] args) {
		InstanceMemberEx03 im1 = new InstanceMemberEx03("2017��");
		System.out.println(im1.year);
		InstanceMemberEx03 im2 = new InstanceMemberEx03("2017��", "3��");
		System.out.println(im2.year + im2.month);
		InstanceMemberEx03 im3 = new InstanceMemberEx03("2017��", "3��", "13��");
		System.out.println(im3.year + im3.month + im3.day);
	}
}
//[��ó] [JAVA/�ڹ�] �ν��Ͻ� ��� �� this�� �ǹ�|�ۼ��� JOKER