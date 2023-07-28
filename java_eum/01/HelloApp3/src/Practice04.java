import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요: ");
		int num = s.nextInt();
		int scoreArr[] = new int[num];
		int scoreSum = 0;
		double avg;
		System.out.print("학생 점수를 입력하세요: ");
		for(int i = 0; i < num; i++) {
			int score = s.nextInt();
			scoreArr[i] = score;
			scoreSum = scoreSum + scoreArr[i];
		}
		avg = scoreSum/num;
		System.out.println("평균: " + avg);
		for(int i = 0; i < num; i++) {
			if(scoreArr[i] >= avg) System.out.println(scoreArr[i] + " pass!");
			else System.out.println(scoreArr[i] + " fail!");
		}
		s.close();
	}
}