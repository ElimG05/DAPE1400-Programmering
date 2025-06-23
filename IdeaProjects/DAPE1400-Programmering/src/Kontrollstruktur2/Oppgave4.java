package Kontrollstruktur2;
//Oppgaver med For og While
/*Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)*/

public class Oppgave4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i = i+2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
