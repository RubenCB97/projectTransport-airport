import java.io.FileNotFoundException;
import java.io.FileReader;
import com.opencsv.*;
public class CSV {

    public void readCSV (){
        try {
            CSVReader lector = new CSVReader(new FileReader("hola.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void csvWriter() {

    }
}
