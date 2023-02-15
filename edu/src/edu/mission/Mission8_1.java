package edu.mission;

public class Mission8_1 {

	public static boolean prime(int num) {
		for(int i = 2; i < num; i++) {
			if(num%i == 0) return false;
		}
		return true;
	}	
	
	public static void main(String[] args) {
		/*for(int i = 0; i < args.length; i++) {
			System.out.println("arg" + i + ":" + args[i]);
		}
		
		System.out.println("DONE");*/
		
		int num = Integer.parseInt(args[0]);
		if(prime(num) == true)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		System.out.println("Done");
	}
}