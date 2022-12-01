import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.*;
public class CSV {
    public static final char SEPARATOR=';';
    public static final char QUOTE='"';

    public ArrayList<String[]> test;
    public ArrayList<String[]> readCSV (){
        CSVReader reader = null;
        test = new ArrayList<>();
        try {
            reader = new CSVReader(new FileReader("Data/FicheroAeropuerto.csv"),SEPARATOR,QUOTE);
            String[] nextLine=null;
            while ((nextLine = reader.readNext()) != null) {

                test.add(nextLine);

            }

            if (null != reader) {
                reader.close();
            }

        } catch (Exception e) {
            System.out.println("Error lectura fichero CSV");
        }

        return test;

    }
    public void csvWriter(ArrayList<String[]> list) {
        String fileCSV = "Data/FicheroAeropuertoExit.csv";

        try {
            ArrayList<String[]> listuax = new ArrayList<>();

            CSVWriter writer = new CSVWriter(new FileWriter(fileCSV,true));

            writer.writeAll(list);
            writer.close();


        } catch (IOException e) {
            System.out.println("Error escritura fichero CSV");
        }


    }
}
