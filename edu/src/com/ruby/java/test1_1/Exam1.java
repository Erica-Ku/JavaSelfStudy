package com.ruby.java.test1_1;

public class Exam1 {
	class sample {
		private int a;
	}
	public static void main(String[] args) {
		Exam1 ex = new Exam1();
		Exam1.sample s = ex.new sample();
		s.a = 10;
	}
}