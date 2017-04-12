import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        String str1 = sc.next();
        String str2 = sc.next();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        String[] arst1 = new String[ch1.length];
        String[] arst2 = new String[ch2.length];

        for (int i = 0; i < ch1.length; i++){
            if (47 < (int)ch1[i] &  (int)ch1[i] < 58){
                arst1[i] = String.valueOf((int)ch1[i] - 48);
            } else if (96 < (int)ch1[i] & (int)ch1[i] < 104){
                arst1[i] =  String.valueOf((int)ch1[i] - 97) + String.valueOf((int)ch1[i] - 96)
                        + String.valueOf((int)ch1[i] - 95) + String.valueOf((int)ch1[i] - 94);
            } else  arst1[i] = "0123456789";
        }
        for (int i = 0; i < ch2.length; i++){
            if (47 < (int)ch2[i] &  (int)ch2[i] < 58){
                arst2[i] = String.valueOf((int)ch2[i] - 48);
            } else if (96 < (int)ch2[i] & (int)ch2[i] < 104){
                arst2[i] =  String.valueOf((int)ch2[i] - 97) + String.valueOf((int)ch2[i] - 96)
                        + String.valueOf((int)ch2[i] - 95) + String.valueOf((int)ch2[i] - 94);
            } else  arst2[i] = "0123456789";
        }
        int res = 1;
        for (int i = 0; i < arst1.length; i++){
            char[] ch3 = arst1[i].toCharArray();
            char[] ch4 = arst2[i].toCharArray();
            int box = 0;
            for (int k = 0; k < ch3.length; k++){
                for (int l = 0; l < ch4.length; l++){
                    if (ch3[k] == ch4[l]) box++;
                }
            }
            res = res * box;
        }
        pw = new PrintWriter(new File("output.txt"));
        pw.print(res);
        pw.close();
    }
}
