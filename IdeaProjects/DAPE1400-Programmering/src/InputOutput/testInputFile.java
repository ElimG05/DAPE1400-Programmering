package InputOutput;
import java.io.FileWriter;
import java.io.IOException;

public class testInputFile {
    public static void main(String[] args) {
        try {
            FileWriter skrivInn = new FileWriter("newFile.txt");
            skrivInn.write ("Jeg prøver å skrive inn i en ny fil");
            skrivInn.write ("Her skriver jeg mer. Ser du dette??");
            skrivInn.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
