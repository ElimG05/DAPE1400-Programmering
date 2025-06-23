package FlereEgneEksamensOppgaver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Oppgave10 {
    public static void main(String[] args) {
        ArrayList<Integer> tallListe = new ArrayList<>();
        Scanner inputFraBruker = new Scanner(System.in);
        System.out.println("Skriv inn så mange heltall du vil (skriv '0' for å avslutte)");


        int sum = 0;
        while (true) {
            int tallFraBruker = (inputFraBruker.nextInt());

            if (tallFraBruker == 0) {
                break;
            }
            tallListe.add(tallFraBruker);
            sum += tallFraBruker;
        }

        System.out.println("Summen av tallene: " + sum);

        Collections.sort(tallListe);
        System.out.println("Det minste tallet: " + tallListe.get(0));
        System.out.println("Det største tallet: " + tallListe.get(tallListe.size() - 1));

        System.out.println("Tallene i stigende rekkefølge:");
        for(int fixedList : tallListe) {
            System.out.println(fixedList);
        }
        inputFraBruker.close();
    }
}
