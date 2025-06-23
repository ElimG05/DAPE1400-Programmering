package Arrays2;
import java.io.File;

public class Øving {
    public static void main (String[]args) {
        File file = new File ("//Users/bruker//Desktop//semester 1//DAPE1400 - Programmering//tester.txt");

        if (file.exists()) {
            System.out.println("Denne filen finnes :)");
        }
        else {
            System.out.println("Denne filen finnes ikke :(");
        }


    }
}
