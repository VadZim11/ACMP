import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().computerNetwork();
    }
    PrintWriter pw;
    Scanner sc;
    public void computerNetwork() throws IOException{
        sc = new Scanner(new File("input.txt"));
        int N = sc.nextInt(), cost = sc.nextInt();
        long money = sc.nextLong();
        int x[] = new int[N+1]; int y[] = new int[N+1];
        for (int i = 0; i <= N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        pw = new PrintWriter(new File("output.txt"));

        for (int i = 0; i < N; i++) {
            double l = 0;
            for (int j = 0; j <= N; j++) {
                l += Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
            }
            if (l * cost <= money) {
                pw.print("YES");
                pw.close();

            }
        }
        pw.print("NO");
        pw.close();

    }
}