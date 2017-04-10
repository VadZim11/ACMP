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
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));
        for (long x = -100; x <= 100; x++){//long т.к корни могут быть 32768
            if (a*x*x*x + b*x*x + c*x + d ==0) pw.print(x + " ");
        }
        pw.close();

        //ПИСЕЦ КАК ПРОСТО
        /*double p = c/a - b*b/3*a*a;
        double q = 2*b*b*b/27*a*a*a - b*c/3*a*a + d/a;
        double Q1 = (p/3)*(p/3)*(p/3) + (q/2)*(q/2);
        double a1 = b/a, b1 = c/a, c1 = d/a;
        double Q = (a1*a1 - 3*b1)/9;
        double R = (2*a1*a1*a1 - 9*a1*b1 + 27*c1)/54;
        if (Q1 > 0){
            double alf = Math.cbrt(-q/2 + Math.sqrt(Q1));
            double bet = Math.cbrt(-q/2 - Math.sqrt(Q1));
            double x1 = alf + bet;
            long x = Math.round(x1 - b / 3 * a);
            pw.print(x);
        } else if (Q1 == 0){
            double alf = Math.cbrt(-q/2 + Math.sqrt(Q1));
            double x1 = 2*alf;
            double x2 = -alf;
            long x = Math.round(x2 - b / 3 * a);
            long y = Math.round(x1 - b / 3 * a);
                    pw.print(x + " " +  y);
        } else {
            double t = Math.acos(R / Math.sqrt(Q * Q * Q)) / 3;
            double x1 = -2 * Math.sqrt(Q) * Math.cos(t) - a1 / 3;
            long x = Math.round(x1);
            double x2 = -2 * Math.sqrt(Q) * Math.cos(t - (2 * Math.PI / 3)) - a1 / 3;
            long y = Math.round(x2);
            double x3 = -2 * Math.sqrt(Q) * Math.cos(t + (2 * Math.PI / 3)) - a1 / 3;
            long z = Math.round(x3);
            pw.print( x + " " +  y + " " +  z);
        }
        pw.close();*/
    }
}
