package FlereEgneEksamensOppgaver;

import java.util.Scanner;

public class Oppgave18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Oppgi ønsket størrelse på arrayet:");
        int arrayStørrelse = scan.nextInt();
        int[] array = new int[arrayStørrelse];

        while (true) {
            System.out.println("Skriv inn en indeks (0 til " + (arrayStørrelse - 1) + ") for å legge til en verdi, eller -1 for å avslutte:");
            int indeks = scan.nextInt();

            if (indeks == -1) {
                break;
            }

            if (indeks >= 0 && indeks < arrayStørrelse) {
                System.out.println("Skriv inn verdien som skal legges på indeks " + indeks + ":");
                int verdi = scan.nextInt();
                array[indeks] = verdi;
            } else {
                System.out.println("Ugyldig indeks! Prøv igjen med en indeks mellom 0 og " + (arrayStørrelse - 1));
            }
        }

        int sum = 0;
        System.out.println("Arrayet ditt inneholder følgende verdier:");
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            System.out.println("Index " + i + ": " + array[i]);
        }

        System.out.println("\nSummen av alle verdiene i arrayet: " + sum);

        scan.close();
    }
}
