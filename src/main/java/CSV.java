import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import com.opencsv.*;
public class CSV {
    public static final char SEPARATOR=';';
    public static final char QUOTE='"';
    public void readCSV (){
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("Data/FicheroAeropuerto.csv"),SEPARATOR,QUOTE);
            String[] nextLine=null;

            while ((nextLine = reader.readNext()) != null) {
                System.out.println(Arrays.toString(nextLine));
            }

            if (null != reader) {
                reader.close();
            }

        } catch (Exception e) {
            System.out.println("Error");
        }


    }
    public void csvWriter() {

    }
}
