package edu;

public class note1 {

	public static void main(String[] args) {
		int [][] a = new int [5][5];
		int [][] b = new int [5][5];
		int [][] c = new int [a.length][a[0].length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				double rnum = Math.random();
				int num = (int) (rnum * 10);
				a[i][j] = num;
			}
		}
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				double rnum = Math.random();
				int num = (int) (rnum * 10);
				b[i][j] = num;}
		}
		
		for(int i = 0; i <c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.println();
		
	}
}