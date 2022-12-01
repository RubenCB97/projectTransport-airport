import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.*;
public class CSV {
    public static final char SEPARATOR=';';
    public static final char QUOTE='"';

    public List<String> test;
    public List<String> readCSV (){
        CSVReader reader = null;
        test = new ArrayList<>();
        try {
            reader = new CSVReader(new FileReader("Data/FicheroAeropuerto.csv"),SEPARATOR,QUOTE);
            String[] nextLine=null;

            while ((nextLine = reader.readNext()) != null) {
                test.add(Arrays.toString(nextLine));
            }

            if (null != reader) {
                reader.close();
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println(test);
        return test;

    }
    public void csvWriter() {

    }
}
