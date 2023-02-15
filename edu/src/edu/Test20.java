package edu;

public class Test20 {

	public static void main(String[] args) {
		int scole = 90;
		char grade;
		
		if(scole >= 90) {
			grade = 'A';
		} else if(scole >= 80) {
			grade = 'B';
		} else if(scole >= 70) {
			grade = 'C';
		} else if(scole >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
	}
}