package Chap5_재귀알고리즘;

public class EightQueen_1 {
	public static void SolveQueen(int[][] d) {
		int count = 0;
		int ix = 0, iy = 0;
		StackQueen st = new StackQueen(d.length);
		d[ix][iy] = 1;
		count++;
		Point pt = new Point(ix, iy);
		st.push(pt);
		// 퀸을 모든 행에 배치할 동안
		while (count < d.length) {
			// 0행부터 검사하겠다
			ix++;
			iy = 0;
			// iy열의 행ix 1행, 2행, 3행들을 다 검사 하겠다.
			while (ix < d.length) {
				System.out.println("ix = " + ix + ", iy = " + iy);
				// 체크해서 가능하면
				iy = NextMove(d, ix, iy);
				if (iy < d.length) {
					d[ix][iy] = 1;
					Point px = new Point(ix, iy);
					st.push(px);
					count++;
					break;

				} else { // 체크해서 가능하지 않으면

					Point pa = st.pop(); // 스택에서 이전 위치를 팝하고

					ix = pa.getX();
					iy = pa.getY(); // 좌표를 돌려놓고,
					d[ix][iy] = 0; // 이전 위치 데이터 삭제
					count--;
					iy++; // 다음 위치를 검사

				}
			}

		}

	}

	// row를 검사함. 왼쪽, 오른쪽을 검사
	public static boolean checkRow(int[][] d, int crow) {

		for (int i = 0; i < d.length; i++) {
			if (d[crow][i] == 1) {
				return false;
			}
		}

		return true;
	}

	// col을 검사. 위, 아래를 검사
	public static boolean checkCol(int[][] d, int ccol) {

		for (int i = 0; i < d[0].length; i++) {
			if (d[i][ccol] == 1) {
				return false;
			}
		}
		return true;
	}

	// 왼쪽 위쪽 대각선을 검사
	public static boolean checkDiagSW(int[][] d, int x, int y) { // x++, y-- or x--, y++ where 0<= x,y <= 7
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

	// 오른쪽 위쪽 대각선을 검사
	public static boolean checkDiagSE(int[][] d, int x, int y) {// x++, y++ or x--, y--
		int cx = x;
		int cy = y;
		while (cx >= 0 && cx <= d.length - 1 && cy >= 0 && cy <= d[0].length - 1) {

			if (d[cx][cy] == 1) {
				return false;
			}
			cx--;
			cy--;
		}
		cx = x;
		cy = y;
		while (cx >= 0 && cx <= d.length - 1 && cy >= 0 && cy <= d[0].length - 1) {

			if (d[cx][cy] == 1) {
				return false;
			}
			cx++;
			cy++;
		}
		cx = x;
		cy = y;
		return true;
	}

	// 양옆, 위아래, 대각선에 1이 없으면 True를 반환한다
	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		if (checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y))
			return true;

		return false;

	}

	public static int NextMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		while (y < d.length) {
			if (CheckMove(d, x, y))
				return y;
			y++;
		}
		return d.length;

	}

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