package Chap5_재귀알고리즘;

public class EightQueen {
	//* 문제 해결형 자바 코딩 실습이 필요
	//- main()의 작성 방법 훈련 - 
	public static void main(String[] args) {
		//배열 초기화
		int row = 8, col = 8;
		int [][]data = new int [row][col];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;
		
		SolveQueen(data);
		
		//배열열 출력: 8개의 queen 배치(여러가지 해를 구해 보여주기)
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
	//- 함수 호출로 구현 훈련
	static void SolveQueen(int [][]d) {
	    //코딩 완성하기
		int count = 0;
		int ix = 0, iy = 0;
		MyStack st = new MyStack();
		d[ix][iy] = 1;
		count++;
		Point pt = new Point(ix, iy);
		st.push(pt);
		while (count < d.length) {
			ix++;
			iy = 0;
			while (ix < d.length) {
				//System.out.println("ix = " + ix + ", iy = " + iy);
				iy = NextMove(d, ix, iy);
				if (iy < d.length) {
					d[ix][iy] = 1;
					Point px = new Point(ix, iy);
					st.push(px);
					count++;
					break;
				} else { 
					Point pa = st.pop(); 
					ix = pa.getX();
					iy = pa.getY(); 
					d[ix][iy] = 0; 
					count--;
					iy++; 
				}
			}
		}
	  }
	// => 8  Queen 문제 풀기: 스택 사용하여 backtracking 코딩 실습
//	    -> 2차원 배열에 0으로 초기화, Queen을 배치하면 1로 설정, 8 X 8 배열에 8개 퀸이 가로 세로 대각선에 충돌이 없으면 성공
	//
//	    -> stack에 Point 객체를 생성하여 push, pop::(x, y, move) => move는 다음 이동 가능 candidate의 column임
	        static class MyStack {
	        	Point data []; //스택용 배열
	        	int top; //스택 포인터
	             
	            public MyStack() {
	         		top = 0;
	         		data = new Point[100];
	             }
	            
	         // --- 스택에 x를 푸시 ---//
	        	public void push(Point p) {
	        		data[top++] = p;
	        	}

	         // --- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	        	public Point pop() {
	        		return data[--top];
	        	}

	          // --- 스택이 비어있는가? ---//
	        	public boolean isEmpty() {
	        		if (top == 0)
	                    return true;
	                else
	                    return false;
	        	}
	         }
//	         void NextMove(int[] move, int row); // current row에 대한 다음 배치 가능한 모든 column을 조사하고 move[]에 1로 설정
	        static int NextMove(int[][] d, int x, int y) {
	    		while (y < d.length) {
	    			if (CheckMove(d, x, y))
	    				return y;
	    			y++;
	    		}
	    		return d.length;
	    	}
//	         boolean CheckMove(int currentRow, int row, int col) //currentRow에 대하여 queen을 (x,y)에 배치 가능하면 true
	        static boolean CheckMove(int[][] d, int x, int y) {
	    		if (checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y))
	    			return true;
	    		return false;
	    	}
//	        => backtracking을 stack을 이용하여 push/pop으로 해결하는 것을 보이는 것임
	//
//	    -> 가로, 세로, 대각선에 대한 충돌 체크 함수 코딩
//	     boolean CheckMove(x,y) {
//		checkRow(x);
	        static boolean checkRow(int[][] d, int x) {
	    		for (int i = 0; i < d.length; i++) {
	    			if (d[x][i] == 1) {
	    				return false;
	    			}
	    		}
	    		return true;
	    	}
//		checkCol(y);
	        static boolean checkCol(int[][] d, int y) {
	    		for (int i = 0; i < d[0].length; i++) {
	    			if (d[i][y] == 1) {
	    				return false;
	    			}
	    		}
	    		return true;
	    	}
//		checkDiagSW(x,y); //x++, y-- or x--, y++ where 0<= x,y <= 7
	        static boolean checkDiagSW(int[][] d, int x, int y) {
	    		int cx = x;
	    		int cy = y;
	    		while (cx >= 0 && cx <= d.length - 1 && cy >= 0 && cy <= d[0].length - 1) {
	    			if (d[cx][cy] == 1) {
	    				return false;
	    			}
	    			cx++;
	    			cy--;
	    		}
	    		cx = x;
	    		cy = y;
	    		while (cx >= 0 && cx <= d.length - 1 && cy >= 0 && cy <= d[0].length - 1) {
	    			if (d[cx][cy] == 1) {
	    				return false;
	    			}
	    			cx--;
	    			cy++;
	    		}
	    		cx = x;
	    		cy = y;
	    		return true;
	    	}
//		checkDiagSE(x,y); //x++, y++ or x--, y--
	        static boolean checkDiagSE(int[][] d, int x, int y) {
	    		int cx = x;
	    		int cy = y;
	    		while (cx >= 0 && cx <= d.length - 1 && cy >= 0 && cy <= d[0].length - 1) {
	    			if (d[cx][cy] == 1) {
	    				return false;
	    			}
	    			cx++;
	    			cy++;
	    		}
	    		cx = x;
	    		cy = y;
	    		while (cx >= 0 && cx <= d.length - 1 && cy >= 0 && cy <= d[0].length - 1) {
	    			if (d[cx][cy] == 1) {
	    				return false;
	    			}
	    			cx--;
	    			cy--;
	    		}
	    		cx = x;
	    		cy = y;
	    		return true;
	    	}
//	     }
}