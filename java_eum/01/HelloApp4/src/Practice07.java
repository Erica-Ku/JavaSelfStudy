import java.util.Scanner;

public class Practice07 {

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("학생 수를 입력하세요: ");
//		int num = s.nextInt();
//		String sScoreArr[][] = new String[num][2];
//		int sum = 0;
//		System.out.print("학생 이름과 점수를 입력하세요: ");
//		for(int i = 0; i < num; i++) {
//			for(int j = 0; j < 2; j++) {
//				sScoreArr[i][j] = s.next();
//			}
//			sum = sum + Integer.parseInt(sScoreArr[i][1]);
//		}
//		s.close();
//		double avg = sum / num;
//		System.out.println("평균: " + avg);
//		for(int i =0; i < num; i++) {
//			if(Double.parseDouble(sScoreArr[i][1]) >= sum / num)
//				System.out.println(sScoreArr[i][0] + " pass!");
//			else System.out.println(sScoreArr[i][0] + " fail!");
//		}
//	}
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("학생 수를 입력하세요: ");
	    int size = s.nextInt();
	    String[] name = new String[size];
	    int[] score = new int[size];
	    System.out.print("학생 이름과 점수를 입력하세요: ");
	    int sum = 0;
	    for (int i = 0; i < size; i++) {
	      name[i] = s.next();
	      score[i] = s.nextInt();
	      sum += score[i];
	    } 
	    s.close();
	    double average = (sum / size);
	    System.out.println("평균: " + average);
	    for (int j = 0; j < size; j++) {
	      if (score[j] >= average) {
	        System.out.println(name[j] + " pass!");
	      } else {
	        System.out.println(name[j] + " fail!");
	      } 
	    } 
	}
}