//==========
// Simple Hello Application in Java
// 콘솔 입출력
//==========

import java.util.Scanner;

public class HelloApp {
	
	public static void main(String[] args) {
		int year = 2023;
		String name;
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		name = s.next();
		System.out.print("현재 연도를 입력하세요: ");
		year = s.nextInt();
		
		String hello = "Hello ";
		System.out.println(hello + name);
		System.out.println("Good Luck in " + year);
		s.close();
	}
}