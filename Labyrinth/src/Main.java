import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Coord implements Comparable<Coord>{
    int h;
    int m;
    int n;

    public Coord (int h, int m, int n) {
        this.h = h;
        this.m = m;
        this.n = n;
    }

    @Override
    public int compareTo(Coord o) {
        if (this.h == o.h && this.m == o.m && this.n == o.n)
            return 0;
        else
            return 1;
    }

    public String toString() {
        return this.h + " "+ this.m + " " + this.n;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        Coord start = null;
        Coord finish = null;
        int [][][] arr = new int[h][m][n];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < m; j++) {
                String temp = sc.nextLine();
                for (int k = 0; k < n; k++) {
                    char ch = temp.charAt(k);
                    if (ch == 'o')
                        arr[i][j][k] = -1;
                    else if (ch == '.')
                        arr[i][j][k] = 0;
                    else if (ch == '1') {
                        arr[i][j][k] = 1;
                        start = new Coord(i, j, k);
                    } else if (ch == '2') {
                        finish = new Coord(i, j, k);
                    }
                }
            }
            if (sc.hasNext())
                sc.nextLine();
        }
        boolean isHere = false;
        Stack<Coord> stack = new Stack<>();
        stack.push(start);
        int path = 0;
        while (!isHere) {
            Stack<Coord> nextStack = new Stack<>();
            while (!stack.isEmpty()) {
                Coord c = stack.pop();
                if (c.compareTo(finish) == 0) {
                    isHere = true;
                    break;
                }
                if (c.m + 1 < m && arr[c.h][c.m + 1][c.n] == 0) {//bottom
                    arr[c.h][c.m + 1][c.n] = path;
                    nextStack.push(new Coord(c.h, c.m + 1, c.n));
                }
                if (c.m - 1 >= 0 && arr[c.h][c.m - 1][c.n] == 0) {//top
                    arr[c.h][c.m - 1][c.n] = path;
                    nextStack.push(new Coord(c.h, c.m - 1, c.n));
                }
                if (c.n + 1 < n && arr[c.h][c.m][c.n + 1] == 0) {//right
                    arr[c.h][c.m][c.n + 1] = path;
                    nextStack.push(new Coord(c.h, c.m, c.n + 1));
                }
                if (c.n - 1 >= 0 && arr[c.h][c.m][c.n - 1] == 0) {//left
                    arr[c.h][c.m][c.n - 1] = path;
                    nextStack.push(new Coord(c.h, c.m, c.n - 1));
                }
                if (c.h + 1 < h && arr[c.h + 1][c.m][c.n] == 0) {//down
                    arr[c.h + 1][c.m][c.n] = path;
                    nextStack.push(new Coord(c.h + 1, c.m, c.n));
                }
            }
            stack = nextStack;
            path++;
        }
        printInFile(String.valueOf((path-1)*5));
    }
    private  static void printInFile(String text) throws IOException {
        FileWriter wr = new FileWriter(new File("OUTPUT.TXT"));
        wr.write(text);
        wr.close();
        System.exit(0);
    }
}