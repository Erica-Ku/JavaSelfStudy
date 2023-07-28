public class Practice06 {

	public static void main(String[] args) {
		double sum = 0;
		for(String arg : args) {
			sum = sum + Double.parseDouble(arg);
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum / args.length);
	}
}