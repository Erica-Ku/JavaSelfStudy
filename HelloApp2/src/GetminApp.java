//==========
// GetMin Application in Java
// 값 입력, 입력된 값들 중 최솟값 출력
//==========

import java.util.Scanner;

public class GetminApp {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 5;
		Scanner s = new Scanner(System.in);
		
		int n, m;
		System.out.print("두 개의 정수를 입력하세요 : ");
		n = s.nextInt();
		m = s.nextInt();
		System.out.println("최솟값은 " + getMin(n, m) + " 입니다.");
		
		double o, p;
		System.out.print("두 개의 실수를 입력하세요 : ");
		o = s.nextDouble();
		p = s.nextDouble();
		System.out.println("최솟값은 " + getMin(o, p) + " 입니다.");
		
		String t1 = null, t2 = null;
		System.out.print("두 개의 문자열을 입력하세요 : ");
		t1 = s.next();
		t2 = s.next();
		System.out.println("최솟값은 " + getMin(t1, t2) + " 입니다.");
		
		int arr[] = {1, 1, 1, 1, 1};
		System.out.print("정수 배열의 5개 원소 : ");
		for(int i = 0; i < ARRAY_SIZE; i++)
			arr[i] = s.nextInt();
		System.out.println("최솟값은 " + getMin(arr) + " 입니다.");
		
		s.close();
	}
	
	static int getMin(int a, int b) {
		return a < b ? a : b;
	}
	
	static double getMin(double x, double y) {
		return x < y ? x : y;
	}
	
	static String getMin(String s1, String s2) {
		return s1.compareTo(s2) < 0 ? s1 : s2;
	}
	
	static int getMin(int[] a) {
		int min = a[0];
		for(int i = 0; i < a.length; i++)
			if(a[i] < min)
				min = a[i];
		return min;
	}
}