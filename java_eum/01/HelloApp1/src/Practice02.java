import java.util.Scanner;

public class Practice02 {

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("두 실수를 입력하세요: ");
//		float num1 = s.nextFloat();
//		float num2 = s.nextFloat();
//		System.out.println("원하는 연산의 번호를 선택하세요");
//		System.out.print("(1) +, (2) -, (3) *, (4) /: ");
//		int o = s.nextInt();
//		s.close();
//		float result = 0;
//		if(o == 1) {
//			result = num1 + num2;
//			System.out.println("덧셈 결과는 " + result + "입니다.");
//		}
//		if(o == 2) {
//			result = num1 - num2;
//			System.out.println("뺄셈 결과는 " + result + "입니다.");
//		}
//		if(o == 3) {
//			result = num1 * num2;
//			System.out.println("곱셈 결과는 " + result + "입니다.");
//		}
//		if(o == 4) {
//			result = num1 / num2;
//			System.out.println("나눗셈 결과는 " + result + "입니다.");
//		}
//	}
	
	public static void main(String[] args) {
		double x, y;
		int op;
		Scanner s = new Scanner(System.in);
		System.out.print("두 실수를 입력하세요: ");
		x = s.nextDouble();
		y = s.nextDouble();
		System.out.println("원하는 연산의 번호를 선택하세요");
		System.out.print("(1) +, (2) -, (3) *, (4) /: ");
		op = s.nextInt();
		switch(op) {
			case 1: System.out.println("덧셈 결과는 " + (x+y) + "입니다");
					break;
			case 2: System.out.println("뺄셈 결과는 " + (x-y) + "입니다");
					break;
			case 3: System.out.println("곱셈 결과는 " + (x*y) + "입니다");
					break;
			case 4: System.out.println("나눗셈 결과는 " + (x/y) + "입니다");
					break;
			default:
					System.err.println("입력 오류!!");
		}
		s.close();
	}
}