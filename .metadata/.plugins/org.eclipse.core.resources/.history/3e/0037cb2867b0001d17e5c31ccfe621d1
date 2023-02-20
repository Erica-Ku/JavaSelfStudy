package Chap5_재귀알고리즘;

public class EightQueen_1 {
	public static void SolveQueen(int[][] d) {
 		int count = 0, answer = 0; // count: queen말 놓으면 1, 아니면 0
		int xrow = 0, ycol = 0; // x:row y:col

		StackQueen st = new StackQueen(10); // traced 좌표 넣을 스택
		Point p = new Point(xrow, ycol);
		d[xrow][ycol] = 1;
		st.push(p);
		count++;
		
		while (count < d.length) {
			
			while (xrow < d.length) {
				xrow++;
				ycol = 0;

				while (ycol < d[0].length) {
					System.out.println("전:xrow = " + xrow + "ycol = " + ycol);
					ycol = NextMove(d, xrow, ycol);
					System.out.println("후: xrow = " + xrow + "ycol = " + ycol);

					if (ycol < d.length) {
						Point px = new Point(xrow, ycol);
						d[xrow][ycol] = 1;
						st.push(px);
						count++;
						break;
					}

					if (ycol >= d[0].length) {
						st.pop();
						xrow = p.getX();
						ycol = p.getY();
						ycol++;
					}

				}

			}
			System.out.println(d[xrow][ycol]);
		}
	}

	public static boolean checkRow(int[][] d, int crow) {
		for (int i = 0; i < d.length; i++) {
			if (d[crow][i] == 1) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkCol(int[][] d, int ccol) {
		for (int j = 0; j < d[0].length; j++) {
			if (d[j][ccol] == 1) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int x, int y) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		int cx = x, cy = y;
		while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx--;
			cy++;
		}
		cx = x;
		cy = y;
		while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx++;
			cy--;
		}
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int x, int y) {// x++, y++ or x--, y--
		int cx = x, cy = y;
		while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx++;
			cy++;
		}
		cx = x;
		cy = y;
		while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx--;
			cy--;
		}
		return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		// 현재 위치 (x,y)에 대하여 가로, 세로, 대각선 체크
		if ((checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y)) == true)
			return true;
		return false;
//		if (d[x][y] == d.length) {
//			for (int i = 0; i < d.length; i++) {
//				System.out.println(d[x][i]);
//			}
//			System.out.println("");
//		} else {
//			for (int i = 0; i < d.length; i++) {
//
//			}
//		}
//		return false;
	}

	public static int NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col
		// 주어진 row에 대하여 col을 이동하여 놓을 지 있는지를 체크하고 가능한 경우에 col을 리턴한다.
		while (col < d.length) {
			if (CheckMove(d, row, col) == true)
				{return col;}
			else {col++;}
		}
		return d.length;
	}

	// 체스 메인 함수
	public static void main(String[] args) {
		int row = 8, col = 8;
		int[][] data = new int[8][8];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		SolveQueen(data);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}