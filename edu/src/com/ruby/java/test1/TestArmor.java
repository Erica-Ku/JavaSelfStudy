package com.ruby.java.test1;
/*class Armor2 {
	private String name;
    private int height;   
    public int takeOff(int value) {
    	System.out.println("엔진 시동: value = " + value);
    	return value - 50;
    }
} */   
public class TestArmor {
    static void test(int ... v) {
    	System.out.print(v.length + " : ");
    	for(int x : v)
    		System.out.print(x + " ");
    	System.out.println();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n;
		//int[][] arr = new int [3][4];
		//Armor a = new Armor();
		//n = a.takeOff(100); //함수 호출
		//a.speedUp(12);
		//System.out.println("n = " + n);
		
		test(1);
		test(1, 2);
		test(1, 2, 3, 4, 5, 6, 7);	
	}
}