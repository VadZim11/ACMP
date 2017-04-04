import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().summa();
    }
    PrintWriter pw;
    Scanner sc;
    public void summa() throws IOException{
        sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        int sum = 0;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
        } else {
            for (int i = n; i <= 1; i++) {
                sum = sum + i;
            }
        }
        pw = new PrintWriter(new File("output.txt"));
        pw.print(sum);
        pw.close();
    }
}
