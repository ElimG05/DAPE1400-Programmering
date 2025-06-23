package Arrays2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*Definer et heltalls-arrayet  : 1,2,3,4,5,6,7,8,9.
Skriv kode for å konvertere dette til et ArrayList.
Skriv så ut denne ArrayListen.*/


public class Oppgave3 {
    public static void main (String[]args) {
        Integer[] heltall = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> liste = new ArrayList<>();

        for (int i : heltall) {
            liste.add(i);
        }

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }
}
