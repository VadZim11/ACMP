import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().identity();
    }
    PrintWriter pw;
    Scanner sc;


    public void identity() throws IOException {
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        String st="";
        try{
            st = sc.nextLine();
        }catch (NoSuchElementException e){}
        int a=0, b=0, c=0;
        String st1, st2 = "", st3, st4, st5;

            if (st.indexOf('=') == -1) {
                Error();
            }else {
                st1 = st.substring(st.indexOf('=') + 1, st.length());
                if (isDigit(st1)){
                    c = Integer.parseInt(st1);
                }else Error();

                if (st1.length() != 0){
                    st2 = st.substring(0, st.indexOf('='));
                    if (st2.length() == 0) Error();
                } else Error();

                if (st2.indexOf('+') == -1 & st2.indexOf('*') == -1 & st2.indexOf('/') == -1 & st2.indexOf('-') == -1){
                    Error();
                }else {

                    if (st2.indexOf('+') != -1) {
                        st3 = st2.substring(0, st2.indexOf('+'));
                        st4 = st2.substring(st2.indexOf('+') + 1, st2.length());
                        if (isDigit(st3)) {
                            a = Integer.parseInt(st3);
                        } else Error();
                        if (isDigit(st4)) {
                            b = Integer.parseInt(st4);
                        } else Error();
                        if (a + b == c) {
                            Yes();
                        } else No();
                    }

                    if (st2.indexOf('*') != -1) {
                        st3 = st2.substring(0, st2.indexOf('*'));
                        st4 = st2.substring(st2.indexOf('*') + 1, st2.length());
                        if (isDigit(st3)) {
                            a = Integer.parseInt(st3);
                        } else Error();
                        if (isDigit(st4)) {
                            b = Integer.parseInt(st4);
                        } else Error();
                        if (a * b == c) {
                            Yes();
                        } else No();
                    }

                    if (st2.indexOf('/') != -1) {
                        st3 = st2.substring(0, st2.indexOf('/'));
                        st4 = st2.substring(st2.indexOf('/') + 1, st2.length());
                        if (isDigit(st3)) {
                            a = Integer.parseInt(st3);
                        } else Error();
                        if (isDigit(st4)) {
                            b = Integer.parseInt(st4);
                        } else Error();
                        if (b == 0){
                            No();
                        }else{
                            if (a / b == c & a % b ==0) {
                                Yes();
                            } else No();
                        }
                    }

                    if (st2.indexOf('-') != -1) {
                        if (st2.charAt(0) == '-'){
                            try {
                            st5 = st2.substring(1, st2.length());
                            st3 = st5.substring(0, st5.indexOf('-'));
                            st4 = st5.substring(st5.indexOf('-') + 1, st5.length());
                            if (isDigit(st3)) {
                             a = Integer.parseInt(st3);
                            } else Error();
                            if (isDigit(st4)) {
                                b = Integer.parseInt(st4);
                            } else Error();
                            if (-a - b == c) {
                                Yes();
                            } else No();
                            } catch (StringIndexOutOfBoundsException e){}
                        }else {
                            st3 = st2.substring(0, st2.indexOf('-'));
                            st4 = st2.substring(st2.indexOf('-') + 1, st2.length());
                            if (isDigit(st3)) {
                                a = Integer.parseInt(st3);
                            } else Error();
                            if (isDigit(st4)) {
                                b = Integer.parseInt(st4);
                            } else Error();
                            if (a - b == c) {
                                Yes();
                            } else No();
                        }
                    }
                }
            }
        }


        void Error(){
            pw.print("ERROR");
            pw.close();
        }

        void Yes(){
         pw.print("YES");
            pw.close();
        }

        void No(){
            pw.print("NO");
            pw.close();
        }

    boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

