package by.Hryshkevich;

import java.io.*;


public class BoltsNuts {

    public static void main(String[] args) {

        // Read the data from the file INPUT.TXT
        int[] bolts = new int[3];
        int[] nuts = new int[3];
        try(BufferedReader reader = new BufferedReader(new FileReader("INPUT.TXT")))
        {
            //Data on bolts
            String[] lineBolts = reader.readLine().split(" ");
            for(int i = 0; i < lineBolts.length; i++){
                bolts[i] = Integer.parseInt(lineBolts[i]);
            }
            //Data on nuts
            String[] lineNuts = reader.readLine().split(" ");
            for(int i = 0; i < lineNuts.length; i++){
                nuts[i] = Integer.parseInt(lineNuts[i]);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        //Determine the number of suitable components
        int usefulBolts = (bolts[0] - (bolts[0] * bolts[1])/ 100);
        int usefulNuts = (nuts[0] - (nuts[0] * nuts[1])/ 100);

        //Assessing the damage
        int costDefectiveDetails;
        if (usefulBolts < usefulNuts) {
            costDefectiveDetails = (bolts[0] - usefulBolts) * bolts[2] + (nuts[0] - usefulBolts) * nuts[2];
        }
        else {
            costDefectiveDetails = (nuts[0] - usefulNuts) * nuts[2] + (bolts[0] - usefulNuts) * bolts[2];
        }

        //Output the amount of damage to the file OUTPUT.TXT
        try(FileWriter writer = new FileWriter("OUTPUT.TXT", false))
        {
            String text = String.valueOf(costDefectiveDetails);
            writer.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
