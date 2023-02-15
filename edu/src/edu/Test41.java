package edu;

import java.util.Scanner;

public class Test41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("화면 입력 값: " + n);
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
