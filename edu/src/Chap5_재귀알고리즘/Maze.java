package Chap5_재귀알고리즘;

class offsets {
	int a, b;
	offsets(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class items {
    private int x;
    private int y;
    private int dir;

    public items(int x, int y, int dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDir() {
        return dir;
    }
}

class MazeStack {
    private int top;
    items[] data;

    public MazeStack() {
        top = 0;
        data = new items[1000];
    }

    public boolean isEmpty() {
        if (top == 0)
            return true;
        else
            return false;
    }

    public void push(items p) {
        data[top++] = p;
    }

    public items pop() {
        return data[--top];
    }
}

public class Maze {
    static int maze[][] = new int[100][100];
    static int mark[][] = new int[100][100];

    public static void path(int m, int n) {
        mark[1][1] = 2;
        MazeStack st = new MazeStack();
        
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

        items p = new items(1, 1, 2);

        st.push(p);

        while (!st.isEmpty()) {
            p = st.pop();
            int i = p.getX();
            int j = p.getY();
            int d = p.getDir();
            while (d < move.length) {
                int g = i + move[d].a;
                int h = j + move[d].b;
                if (g == m && h == n) {
                    mark[g][h] = 2;
                    System.out.println("the term near the exit: " + i + " " + j);
                    System.out.println("exit: " + m + " " + n);
                    return;
                }
                if (maze[g][h] == 0 && mark[g][h] == 0) {
                    mark[g][h] = 2;
                    st.push(new items(i, j, d+1));
                    i = g;
                    j = h;
                    d = 0;
                } else {
                    if (d + 1 >= move.length) {
                        mark[i][j] = 1;
                        break;
                    }
                    d++;
                }
            }
        }
        System.out.println("no path in maze ");
    }

    public static void main(String[] args) {
        int[][] input = {
                {0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1},
                {0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0},
                {1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
                {0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
                {0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1},
                {1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
        };

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 17; j++) {
                if ((i == 0) || (j == 0) || (i == 13) || (j == 16))
                    maze[i][j] = 1;
                else
                    maze[i][j] = input[i - 1][j - 1];
            }
        }

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        path(12, 15);

        System.out.println();
        //확정 2, 되돌아감 1
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.print(mark[i][j] + " ");
            }
            System.out.println();
        }
    }
}