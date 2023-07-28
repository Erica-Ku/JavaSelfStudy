import java.util.Scanner;

public class Practice05 {

//	public static void main(String[] args) {
//		int kScore[] = new int[5];
//		int mScore[] = new int[5];
//		int kMax = 0, mMax = 0;
//		int kMin = 100, mMin = 100;
//		int kSum = 0, mSum = 0;
//		int kAvg, mAvg;
//		Scanner s = new Scanner(System.in);
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.print((i+1) + "번째 학생의 국어 성적: ");
//			kScore[i] = s.nextInt();
//			System.out.print((i+1) + "번째 학생의 수학 성적: ");
//			mScore[i] = s.nextInt();
//			if(kScore[i] > kMax) kMax = kScore[i];
//			if(kScore[i] < kMin) kMin = kScore[i];
//			kSum = kSum + kScore[i];
//			if(mScore[i] > mMax) mMax = mScore[i];
//			if(mScore[i] < mMin) mMin = mScore[i];
//			mSum = mSum + mScore[i];
//		}
//		s.close();
//		kAvg = kSum / 5;
//		mAvg = mSum / 5;
//		System.out.println();
//		System.out.println("국어 최고 점수: " + kMax);
//		System.out.println("국어 최저 점수: " + kMin);
//		System.out.println("국어 총점: " + kSum);
//		System.out.println("국어 평균: " + kAvg);
//		System.out.println();
//		System.out.println("수학 최고 점수: " + mMax);
//		System.out.println("수학 최저 점수: " + mMin);
//		System.out.println("수학 총점: " + mSum);
//		System.out.println("수학 평균: " + mAvg);
//		System.out.println();
//		int sum = 0;
//		for(int i = 0; i < 5; i++) {
//			sum = kScore[i] + mScore[i];
//			System.out.println((i+1) + "번째 학생 총점: " + sum + " 석차: ");
//		}
//	}
	
	static final int COUNT = 5;
	
	public static void main(String[] args) {
	    int koreanMax = 0;
	    int koreanMin = 100;
	    int mathMax = 0;
	    int mathMin = 100;
	    int koreanSum = 0;
	    int mathSum = 0;
	    int[] koreanScore = { -1, -1, -1, -1, -1 };
	    int[] mathScore = { -1, -1, -1, -1, -1 };
	    int[] sumScore = { -1, -1, -1, -1, -1 };
	    int[] rank = { 1, 1, 1, 1, 1 };
	    Scanner scan = new Scanner(System.in);
	    int i;
	    for (i = 0; i < 5; i++) {
	      System.out.print((i + 1) + "번째 학생의 국어 성적: ");
	      koreanScore[i] = scan.nextInt();
	      System.out.print((i + 1) + "번째 학생의 수학 성적: ");
	      mathScore[i] = scan.nextInt();
	    }
	    scan.close();
	    for (i = 0; i < 5; i++) {
	      if (koreanScore[i] > koreanMax)
	        koreanMax = koreanScore[i]; 
	      if (koreanScore[i] < koreanMin)
	        koreanMin = koreanScore[i]; 
	      koreanSum += koreanScore[i];
	    } 
	    for (i = 0; i < 5; i++) {
	      if (mathScore[i] > mathMax)
	        mathMax = mathScore[i]; 
	      if (mathScore[i] < mathMin)
	        mathMin = mathScore[i]; 
	      mathSum += mathScore[i];
	    } 
	    printScore("국어", koreanMax, koreanMin, koreanSum);
	    printScore("수학", mathMax, mathMin, mathSum);
	    for (i = 0; i < 5; i++)
	      sumScore[i] = koreanScore[i] + mathScore[i]; 
	    for (i = 0; i < 5; i++) {
	      for (int j = 0; j < 5; j++) {
	        if (sumScore[i] < sumScore[j])
	          rank[i] = rank[i] + 1; 
	      } 
	    } 
	    System.out.println();
	    for (i = 0; i < 5; i++)
	      System.out.println(String.valueOf(i + 1) + "번째 학생 총점: " + sumScore[i] + 
	          " 석차: " + rank[i]);
	}
	
	public static void printScore(String course, int max, int min, int sum) {
	    System.out.println();
	    System.out.println(String.valueOf(course) + " 최고 점수: " + max);
	    System.out.println(String.valueOf(course) + " 최저 점수: " + min);
	    System.out.println(String.valueOf(course) + " 총점: " + sum);
	    System.out.println(String.valueOf(course) + " 평균: " + (sum / 5));
	}
}