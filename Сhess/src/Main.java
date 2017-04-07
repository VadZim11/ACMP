import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().horseCourse();
    }
    PrintWriter pw;
    Scanner sc;
    public void horseCourse() throws IOException{
        sc = new Scanner(new File("input.txt"));
        String str = sc.next();
        char[] ch = str.toCharArray();

        pw = new PrintWriter(new File("output.txt"));

        if (ch.length != 5 || (int)ch[0] < 65 || (int)ch[0] > 72 || (int)ch[3] < 65 || (int)ch[3] > 72
            || (int)ch[1] < 49 || (int)ch[1] > 56 || (int)ch[4] < 49 || (int)ch[4] > 56 || (int)ch[2] != 45) {
            pw.print("ERROR");
        } else {
            if (Math.abs((int) ch[0] - (int) ch[3]) == 1 && Math.abs((int) ch[1] - (int) ch[4]) == 2
                    || Math.abs((int) ch[0] - (int) ch[3]) == 2 && Math.abs((int) ch[1] - (int) ch[4]) == 1) {
                pw.print("YES");
            } else {
                pw.print("NO");
            }
        }
        pw.close();
    }
}