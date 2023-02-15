package com.ruby.java.ch09;

public class MyObject {
	int num;
	
	MyObject(int num) {
		this.num = num;
	}
	public String toString() {
		return "MyObject" + super.toString();
	}
	public boolean equals(Object obj) {
		boolean result = false;
		MyObject arg = (MyObject) obj;
		if(this.num == arg.num) {
			result = true;
		}
		return result;
	}
}