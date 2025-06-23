package FlereEgneEksamensOppgaver;

import java.io.*;
import java.util.Scanner;

public class Oppgave3 {
    public static void main(String[] args) {
        Scanner inputFraBruker= new Scanner(System.in);
        File fil = new File("oppgave3.txt");
        try {
            System.out.println("Skriv en tekst om hva du tenker på (helst 5 eller flere setninger)");
            String brukerSinTekst = inputFraBruker.nextLine();

            FileWriter skrivTilFil = new FileWriter(fil);
            skrivTilFil.write(brukerSinTekst);
            skrivTilFil.close();

            System.out.println("-----Nå har teksten din blitt skrivet inn i filen oppgave3.txt-----");

            Scanner lesFraFil = new Scanner(fil);

            System.out.println("Ønsker du at teksten din skrives ut i konsollen? (ja/nei)");
            String svarFraBruker = inputFraBruker.nextLine();

            if (!svarFraBruker.equals("nei")) {
                while(lesFraFil.hasNext()) {
                        String tekstFraFil = lesFraFil.nextLine();
                        System.out.println(tekstFraFil);
                        System.out.println("Ha en fin dag videre!");
                }
            }
            else {
                System.out.println("Ha en fin dag videre!");
            }
            lesFraFil.close();
        }

        catch (IOException e) {
            System.out.println("Noe gikk galt! Prøv igjen");
            throw new RuntimeException(e);
        }
    }
}
