package edu.mission;

import java.util.Scanner;

public class Mission7_1 {

	public static void main(String[] args) {
		int col;
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("Column : ");
			col = scanner.nextInt();
		} catch (Exception e) {
			return;
		}
		
		System.out.println("-".repeat(30));
		
		if(col < 1 || 9 < col) {
			System.out.println("col is not valid!");
			return;
		}
		
		for(int i = 2; i <= 9; i+=col) {
			for(int j = 1; j <= 9; j++) {
				for(int k = 0; k < col; k++) {
					
					if(10 <= i+k) {
						System.out.print("\n");
						break;
					}
					
					System.out.printf("%2d*%2d=%3d", (i+k), j, (i+k)*j);
					
					if(k < col-1) System.out.print("\t");
					else		  System.out.print("\n");
				}
			}
			System.out.println("-".repeat(30));
		}
	}
}