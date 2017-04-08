import java.math.BigInteger;
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
        BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger(), c = sc.nextBigInteger();
        BigInteger max = a.max(b).max(c);
        pw = new PrintWriter(new File("output.txt"));
        pw.print(max);
        pw.close();
    }
}
