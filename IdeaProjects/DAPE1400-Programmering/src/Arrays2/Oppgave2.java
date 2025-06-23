package Arrays2;

import java.util.ArrayList;
import java.util.Collections;
/*Bruk samme array som i oppgave 1. Legg til tallene 10 og 11 i arrayet.
Slett så elementene med tallene 2 og 3.
Skriv så ut hele arrayet med en for-løkke. Bruk size() for å finne lengden i arrayet.*/

public class Oppgave2 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();

        for (int i = 1; i <= 11; i++) {
            liste.add(i);
        }

        liste.remove(liste.indexOf(2));
        liste.remove(liste.indexOf(3));

        Collections.sort(liste);

        for (int tall : liste) {
            System.out.print(tall + " ");
        }

        System.out.println("\nStørrelsen på listen er: " + liste.size());
    }
}
