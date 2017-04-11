import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] argv) throws IOException {
        new Main().arrow();
    }

    PrintWriter pw;
    Scanner sc;

    public void arrow() throws IOException {

        sc = new Scanner(new File("input.txt"));
        String str = ">";
        try{
            str = sc.next();
        }catch (NoSuchElementException e){}
        char[] ch = str.toCharArray();
        int amArrow = 0;
        for (int i = 0; i < (ch.length - 4); i++) {
            if (((int)ch[i] == 62) & ((int)ch[i + 1] == 62) & ((int)ch[i + 2] == 45) & ((int)ch[i + 3] == 45) & ((int)ch[i + 4] == 62)){
                amArrow++;
            } else if (((int)ch[i] == 60) & ((int)ch[i + 1] == 45) & ((int)ch[i + 2] == 45) & ((int)ch[i + 3] == 60) & ((int)ch[i + 4] == 60)){
                amArrow++;
            }
        }
            pw = new PrintWriter(new File("output.txt"));
            pw.print(amArrow);
            pw.close();
        }
    }

