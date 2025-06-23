package InputOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testOutputFile {
    public static void main(String[] args) {
        File f = new File ("Filer/testtest.txt");
        try {
            Scanner input = new Scanner (f);
            while (input.hasNextLine()){
                String s = input.nextLine();
                System.out.println(s);
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Det er noe galt! Finner ikke filen du har satt inn");
            throw new RuntimeException(e);

        }
    }

}
