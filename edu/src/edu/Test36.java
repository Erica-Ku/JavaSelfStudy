package edu;

public class Test36 {

	public static void main(String[] args) {
		char letter = 'A';
		int n = (int) letter;
		System.out.println(n);
		char[] alpabet = new char[136];
		
		for(int i = 0; i < alpabet.length; i++) {
			alpabet[i] = (char) (letter + i);
		}
		//System.out.print(alpabet);
		
		for(char c : alpabet) {
			System.out.print(" " + c);
		}
	}
}