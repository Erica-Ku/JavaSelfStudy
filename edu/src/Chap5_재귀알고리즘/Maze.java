package Chap5_재귀알고리즘;

public class Maze {
	
	static class offsets {
		int a, b;
		offsets(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	static class items {
		int x;
		int y;
		int dir;
		items(int x, int y, int dir) {
			this.x = x;
			this.y = y;
			this.dir = dir;
		}
	}
	
	static void path(int[][] maze, int[][] mark, int x, int y) {
		MazeStack st = new MazeStack(100);
		offsets move[] = new offsets[8];
		for(int i = 0; i < 8; i++) {
			move[i] = new offsets(0,0);
		}
		move[0].a = -1;
		move[0].b = 0;
		move[1].a = -1;
		move[1].b = 1;
		move[2].a = 0;
		move[2].b = 1;
		move[3].a = 1;
		move[3].b = 1;
		move[4].a = 1;
		move[4].b = 0;
		move[5].a = 1;
		move[5].b = -1;
		move[6].a = 0;
		move[6].b = -1;
		move[7].a = -1;
		move[7].b = -1;
		
		mark[1][1] = 1;
		
		items temp = new items(0, 0, 0);
		temp.x = 1;
		temp.y = 1;
		temp.dir = 2;
		st.push(temp);
		
		while(!st.isEmpty()) {
			temp = st.pop();
			int i = temp.x; int j = temp.y; int d = temp.dir;
			while(d<8) {
				int g = i + move[d].a;
				int h = j + move[d].b;
				if ((g == 12) && (h == 15)) {
					mark[g][h] = 2;
					//st.push(new items(i,j,d));
					//st.push(new items(g,h,d));
					System.out.println("the term near the exit: " + i + " " + j );
					System.out.println("exit: " + 12 + " " + 15);
					System.out.println();
					return;
				}
				if ((maze[g][h]==0) && (mark[g][h]==0)) {
					mark[g][h] = 2;
					//temp.x = i;  temp.y = j; temp.dir = d + 1;
					items tmp = new items(i, j, d + 1);
					st.push(tmp);
					//st.push(temp);
					i = g; j = h; d = 0;
				} else {if(d+1>=8) {
					mark[i][j] = 1;
					break;
					}
					mark[i][j] = 2;
				}
				d++;
			}
		}
		System.out.println("no path in maze ");
}
	
	public static void main(String[] args) {
		int maze[][] = new int [14][17];
		int mark[][] = new int [14][17];
		int input[][] = {{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
						{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
						{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
						{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
						{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
						{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
						{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
						{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
						{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
						{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
						{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
						{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }};
		
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 17; j++)
			{
				if ((i==0) || (j==0) || (i == 13) || (j == 16))
					maze[i][j] = 1;
				else {
					maze[i][j] = input[i - 1][j - 1];
				};
				mark[i][j] = 0;
			}
		}
		//미로
		for (int i = 0; i < 14; i++)
		{
			for (int j = 0; j < 17; j++)
				System.out.print(maze[i][j] + " "); 
			System.out.println();
		}
		
		path(maze, mark, 12, 15);
		//확정: 2, 되돌아감: 1
		for (int i = 0; i < 14; i++)
		{
			for (int j = 0; j < 17; j++)
				System.out.print(mark[i][j] + " "); 
			System.out.println();
		}
	}
}