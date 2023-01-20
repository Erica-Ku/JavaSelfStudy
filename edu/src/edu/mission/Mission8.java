package edu.mission;

import java.util.Scanner;

public class Mission8 {

	public static void prime(int n) {
		
		for(int i = 2; i < n; i++) {
			if ((n%i) == 0) {
				System.out.println(n + ": 소수가 아닙니다.");
				break;
			}
			if((n%i) != 0) {
				System.out.println(n + ": 소수입니다.");
			}
		}
	}	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		
		while((n = scanner.nextInt()) != 0) {
			prime(n);
		}
		scanner.close();
	}
}