package Arrays2;
import java.util.ArrayList;
import java.util.List;
/*Definer et ArrayList attay : 1,2,3,4,5,6,7,8,9.
Skriv kode for å konvertere dette til et vanlig heltalls-array.
Skriv så kode for å skrive ut det nye heltalls-arrayet*/

public class Oppgave4 {
    public static void main (String []args) {
        ArrayList<Integer> liste = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            liste.add(i);
        }

        int [] heltall = new int [liste.size()];

        for (int i = 0; i < liste.size(); i++) {
            heltall[i] = liste.get(i);
        }

        for (int i : heltall) {
            System.out.println((i + " "));
        }
    }

}
