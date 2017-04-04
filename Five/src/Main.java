import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().five();
    }
    PrintWriter pw;
    Scanner sc;
    public void five() throws IOException{
        sc = new Scanner(new File("input.txt"));
        long n=sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));
        pw.print(n*n);
        pw.close();
    }
}
