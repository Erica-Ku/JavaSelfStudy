//==========
// Simple Hello Application in Java
// 정수들을 main의 인자로 전달받아 합을 구함
//==========

public class ArgsApp {

	public static void main(String[] args) {
		int sum = 0;
		
//		for(int i = 0; i < args.length; i++)
//			sum = sum + Integer.parseInt(args[i]);
		
		// 개선된 for문 -> 다 채워진 배열에만 사용!
		for(String s : args)
			sum = sum + Integer.parseInt(s);
		
		System.out.println("합: " + sum);
	}
}