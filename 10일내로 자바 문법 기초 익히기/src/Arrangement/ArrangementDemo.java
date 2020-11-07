package Arrangement;

public class ArrangementDemo {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int su=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				++su;
				arr[i][j] = su;
				System.out.printf("%-10d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
