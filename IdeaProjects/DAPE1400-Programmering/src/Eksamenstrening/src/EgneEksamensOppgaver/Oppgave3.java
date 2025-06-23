package EgneEksamensOppgaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Oppgave3 {
    public static void main(String[] args) {
        Scanner undersokelse = new Scanner(System.in);

        try {
            FileWriter undersokelseDok = new FileWriter("personer.txt");
            while (true) {
                System.out.println("Hei. Skriv inn navnet ditt");
                String navn = undersokelse.nextLine();

                System.out.println("Skriv inn hvilken aldersgruppe du tilhører (barn, ungdom, voksen)");
                String aldersgruppe = undersokelse.nextLine();

                while (!aldersgruppe.equals("barn") && !aldersgruppe.equals("ungdom") && !aldersgruppe.equals("voksen")) {
                    System.out.println("Skriv inn en gyldig aldersgruppe");
                    aldersgruppe = undersokelse.nextLine();
                }


                undersokelseDok.write("\nNavn: " + navn + "\n");
                undersokelseDok.write("Aldersgruppe: " + aldersgruppe + "\n");
                undersokelseDok.write("-----------------------------\n");

                System.out.println("Har du lyst til å legge inn flere personer? (ja/nei)");
                String svar = undersokelse.nextLine();

                if (svar.equals("nei")) {
                    break;
                }

            }
            undersokelseDok.close();
            System.out.println("Nå er alt blitt skrevet inn i filen 'personer.txt'......");

            File file = new File("personer.txt");
            Scanner filLeser = new Scanner(file);

            while (filLeser.hasNextLine()) {
                    String linje = filLeser.nextLine();
                    System.out.println(linje);
            }

            filLeser.close();
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke lese fra filen. Vennligst prøv igjen!");

        } catch (IOException e) {
            System.out.println("Noe gikk galt!. Vennligst prøv igjen!");
            throw new RuntimeException(e);
        }

    }
}
