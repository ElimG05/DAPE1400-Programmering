package Arrays1;
/*Bruk arrayet i oppgave 4 og skriv kode for å finne det største og minste tallet i arrayet via en løkke.
Tips: Sett største og minste tallet til første elementet i arrayet før løkken.*/

import javax.lang.model.type.DeclaredType;

public class Oppgave5 {
    public static void main(String[]args) {
        int [] heltall = {45, 34, 5, 8, 10, 2, 13, 25};

        int største = heltall[0];
        int minste = heltall[0];

        for (int i = 0; i < heltall.length; i++) {
            if (heltall[i] > største) {
               største = heltall[i];
            }

            else if (heltall[i] < minste) {
                minste = heltall[i];
            }
        }
        System.out.println("Det største tallet i arrayet er " + største + " og det minste tallet er " + minste);

    }
}
