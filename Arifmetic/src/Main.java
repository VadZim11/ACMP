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
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));
        if (a*b == c) pw.print("YES");
        else pw.print("NO");
        pw.close();
    }
}