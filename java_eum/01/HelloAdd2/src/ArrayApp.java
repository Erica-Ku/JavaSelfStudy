//==========
// 2차원 배열 Example
//==========

public class ArrayApp {

	public static void main(String[] args) {
		int scoreArray[][] = {{87, 90, 78},  // 첫번째 학생 점수
							  {90, 88, 80},  // 두번째 학생 점수
							  {95, 88, 85},  // 세번째 학생 점수
							  {77, 89, 93}}; // 네번째 학생 점수
		
		for(int i = 0; i < scoreArray.length; i++) {
			double total = 0;
			for(int j = 0; j < scoreArray[i].length; j++)
				total = total + scoreArray[i][j];
			System.out.println((i+1) + "번째 학생의 총점: " + total);
			System.out.println((i+1) + "번째 학생의 평균: " + total/scoreArray[i].length);
		}
	}
}