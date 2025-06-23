package FlereEgneEksamensOppgaver;

import java.util.ArrayList;
import java.util.Scanner;

public class Oppgave13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //a)
        System.out.println("Skriv inn så mange tall du vil. Programmet vil stoppe når summen av tallene er større enn 100");
        int sum = 0;
        int antall = 0;
        while(sum <= 100) {
            int inputFraBruker = scan.nextInt();
            sum+=inputFraBruker;
            antall++;
        }
        System.out.println("Det ble lest inn " + antall + " tall");

        //b)
        System.out.println("Skriv inn tekst (skriv 'stopp' i egen linje for å avslutte):");

        ArrayList<String> tekstListe = new ArrayList<>();
        String tekstFraBruker;

        do {
            tekstFraBruker = scan.nextLine();
            if (!tekstFraBruker.equals("stopp")) {
                tekstListe.add(tekstFraBruker);
            }
        } while (!tekstFraBruker.equals("stopp"));

        System.out.println("Teksten du skrev inn:");
        for (String tekst : tekstListe) {
            System.out.println(tekst);
        }

        scan.close();
    }
}
