package FlereEgneEksamensOppgaver;

import java.util.Scanner;

public class Oppgave4 {
    public static void main(String[] args) {
        //a)
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Summen: " + sum);


        //b)
        Scanner inputFraBruker = new Scanner(System.in);
        System.out.println("Dette programmet regner ut gjennomsnittet");
        System.out.println("Skriv inn noen heltall (skriv inn -1 for å stoppe)");

        int antall = 0;
        int sum2 = 0;
        while (true) {
            int tallFraBruker = inputFraBruker.nextInt();
            if (tallFraBruker == -1) {
                break;
            }
            antall++;
            sum2 += tallFraBruker;
        }
        inputFraBruker.close();

        double gjennomsnitt = (double) sum2/antall;
        System.out.println("Gjennomsnittet av tallene dine: " + (String.format("%.2f",gjennomsnitt)));



    }
}
