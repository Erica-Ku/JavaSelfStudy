public class Practice03 {

	public static void main(String[] args) {
		int scoreArr[] = {83, 90, 95, 88, 72};
		int scoreMax = 0;
		char grade;
		for(int i = 0; i < scoreArr.length; i++) {
			if(scoreArr[i] > scoreMax) scoreMax = scoreArr[i];
		}
		System.out.println("최고점수 = " + scoreMax);
		for(int i = 0; i < scoreArr.length; i++) {
			if(scoreArr[i] >= 90) grade = 'A';
			else if(scoreArr[i] >= 80) grade = 'B';
			else if(scoreArr[i] >= 70) grade = 'C';
			else grade = 'D';
			System.out.println((i+1) + "번째 학생 = " + grade);
		}
	}
}