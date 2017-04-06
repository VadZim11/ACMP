import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().statistic();
    }
    PrintWriter pw;
    Scanner sc;
    public void statistic() throws IOException{
        sc = new Scanner(new File("input.txt"));
        int box = sc.nextInt();
        int[] data = new int[box];
        int[] evenData = new int[box];
        int[] oddData = new int[box];
        int j = 0;
        int k = 0;

        for (int i = 0; i < box; i++){
            data[i] = sc.nextInt();
        }

        for (int i = 0; i < box; i++){
            if (data[i] % 2 == 0){
                evenData[j] = data[i];
                j++;
            } else {
                oddData[k] = data[i];
                k++;
            }
        }

        pw = new PrintWriter(new File("output.txt"));
        for (int i = 0; i < k; i++) {
            pw.print(oddData[i] + " ");
        }
        pw.println();

        for (int i = 0; i < j; i++) {
            pw.print(evenData[i] + " ");
        }
        pw.println();

        if (j>=k){
            pw.println("YES");
        }else {
            pw.println("NO");
        }
        pw.close();
    }
}
