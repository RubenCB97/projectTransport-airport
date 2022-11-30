import java.io.FileNotFoundException;
import java.io.FileReader;
import com.opencsv.*;
public class csvCreator {

    public void aaa {
        try {
            CSVReader lector = new CSVReader(new FileReader("hola.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
