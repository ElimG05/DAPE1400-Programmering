package Kontrollstruktur2;
//Oppgaver med For og While
/*Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).

Finn også gjennomsnittet.*/

public class Oppgave8 {
    public static void main(String[] args) {
        int i = 0; int sum = 0;
        while (i < 100) {
            i = i + 2;
            sum = sum + i;
        }
        int gjennomsnitt = sum / 100;
        System.out.println("Summen er " + sum);
        System.out.println("Gjennomsnitten er " + gjennomsnitt);

    }
}
