package edu.mission;

public class Mission4 {
	public static void printArray(int[][] arr) {
		for (int i = 0 ; i < arr.length ; i++ ) {
			for(int j = 0 ; j < arr[0].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4}, {5,6,7,8,}, {9,10,11,12}};
		int [][] b = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
		int [][] c = new int[3][3];
		
		printArray(a);
		System.out.println();
		printArray(b);
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				int sum = 0;
				for(int k = 0; k < b.length; k++) {
					sum += a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		printArray(c);
	}
}