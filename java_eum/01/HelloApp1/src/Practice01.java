import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		double r = s.nextDouble();
		s.close();
		double area = r * r * Math.PI;
		System.out.println();
		System.out.println("원의 면적은 " + area + "입니다.");
	}
}