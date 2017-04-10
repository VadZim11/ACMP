import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] argv) throws IOException {
        new Main().drum();
    }

    PrintWriter pw;
    Scanner sc;

    public void drum() throws IOException {

        sc = new Scanner(new File("input.txt"));
        int b=sc.nextInt();
        int[] a = new int[b];
        for(int i = 0; i < b; i++){
            a[i] = sc.nextInt();
        }
        int n = b-1;
        for (int k = 1; k <= n; k++) {
            if (n % k == 0) {
                int j = 0;
                while ((j < n) & (a[j] == a[j % k])) j++;
                if (j == n) n = k;
            }
        }
        pw = new PrintWriter(new File("output.txt"));
        pw.print(n);
        pw.close();
    }
}
