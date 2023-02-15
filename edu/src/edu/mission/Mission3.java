package edu.mission;

import java.util.Scanner;
public class Mission3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String a = "";

		while(n>0) {
			a = n%2 + a; //자바니까 가능함
			n /= 2;
		}
		System.out.println(a);
		scanner.close();
		}
	}