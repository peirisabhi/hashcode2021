/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode2021;

import hashcode2021.models.Street;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abhi
 */
public class Hashcode2021 {

    /**
     * @param args the command line arguments
     */
    public static List<Street> streets = new ArrayList<>();

    static int D = 0;
    static int I = 0;
    static int S = 0;
    static int V = 0;
    static int F = 0;

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("F:\\Abhishek\\hashcode2021\\a-1.txt");
            BufferedReader br = new BufferedReader(fr);

            StringBuffer sb = new StringBuffer();
            String line = null;

            int count = 0;

            while ((line = br.readLine()) != null) {
                sb.append(line);

                String[] split = line.split(" ");
                if (count == 0) {  // is first line assign data to the variables............
                    D = Integer.valueOf(split[0]);
                    I = Integer.valueOf(split[1]);
                    S = Integer.valueOf(split[2]);
                    V = Integer.valueOf(split[3]);
                    F = Integer.valueOf(split[4]);
                }

                System.out.println(D + " " + I + " " + S + " " + V + " " + F);

                if (count != 0 && count <= S) {
                    Street street = new Street(Integer.valueOf(split[0]), Integer.valueOf(split[1]), split[2], Integer.valueOf(split[3]));
                    streets.add(street);
                    System.out.println(street.toString());
                }

                count++;
            }
            
            writeFile();

            System.out.println("---street size --- " + streets.size());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void writeFile() {
        try {
            File myObj = new File("F:\\Abhishek\\hashcode2021\\src\\outputFiles\\a-1.txt");
            if (myObj.createNewFile()) {
                FileWriter myWriter = new FileWriter(myObj);
                
                myWriter.write(D + " " + I + " " + S + " " + V + " " + F );
                myWriter.write(System.getProperty( "line.separator" ));
                for (Street street : streets) {
                    myWriter.write(street.getStartIntersections() + " " + street.getEndIntersections() + " " + street.getStreet() + " " + street.getTime());
                    myWriter.write(System.getProperty( "line.separator" ));
                }

                myWriter.close();

                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
