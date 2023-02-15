package edu;

public class Test38 {

	public static void main(String[] args) {
		int[][]a = new int[4][5];
		int[][]b = new int[5][7];
		//int[][]c = new int[3][3];
		int[][]d = new int[4][7];
		//int num = 1;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				double rnum = Math.random();
				int num = (int) (rnum * 5);
				a[i][j] = num;
			}
		}
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				double rnum = Math.random();
				int num = (int) (rnum * 5);
				b[i][j] = num;
			}
		}
		
		System.out.println("행렬 a = ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		System.out.println("행렬 b = ");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.println();
		//행렬 더하기 c = a + b
		/*System.out.println("행렬 c = ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.println();*/
		// d = a * b 행렬 곱한 결과를 d에 저장
		System.out.println("행렬 d = ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				int sum = 0;
				for(int k = 0; k < a[i].length; k++) {
					sum += a[i][k] * b[k][j];
				}
				d[i][j] = sum;
				System.out.print(d[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}