import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().homeWork();
    }
    PrintWriter pw;
    Scanner sc;
    public void homeWork() throws IOException{
        sc = new Scanner(new File("input.txt"));
        int box = sc.nextInt();
        int[] arrayNamder = new int[box];
        for (int i = 0; i < box; i++){
            arrayNamder[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < box; i++){
            if (arrayNamder[i] >= 0) sum = sum + arrayNamder[i];
            }

        int min = arrayNamder[0];
        int indexMin = 0;
        for (int i = 0; i < box; i++){
            if (arrayNamder[i] < min){
                min = arrayNamder[i];
                indexMin = i;
            }
        }

        int max = arrayNamder[0];
        int indexMax = 0;
        for (int i = 0; i < box; i++){
            if (arrayNamder[i] > max){
                max = arrayNamder[i];
                indexMax = i;
            }
        }


        int multiplication = 1;
        if (indexMin < indexMax) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                multiplication = multiplication * arrayNamder[i];
            }
        } else{
            for (int i = indexMax + 1; i < indexMin; i++) {
                multiplication = multiplication * arrayNamder[i];
            }
        }

        pw = new PrintWriter(new File("output.txt"));
        pw.print(sum + " " +  multiplication);
        pw.close();
    }
}
