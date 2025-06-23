package FlereEgneEksamensOppgaver;

import java.util.Scanner;

class BrukerInput {

    public static void printMeny() {
        System.out.println("Dette er en meny. Velg mellom valgene (1-3) under:");
        System.out.println("1. Skriv ut en hilsen");
        System.out.println("2. Regn ut summen av to heltall");
        System.out.println("3. Avslutt programmet");
    }

    public static void hilsen() {
        System.out.println("Hei, bruker!\n");
    }

    public static void sumToTall(Scanner scan) {
        System.out.println("Skriv inn det første tallet:");
        int tall1 = scan.nextInt();
        System.out.println("Skriv inn det andre tallet:");
        int tall2 = scan.nextInt();
        int sum = tall1 + tall2;
        System.out.println("Summen av de to tallene dine: " + sum + "\n");
    }

    public static void avslutt() {
        System.out.println("Programmet er avsluttet. Ha en fin dag videre!");
    }
}

public class Oppgave16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valg = 0;
        while (valg != 3) {
            BrukerInput.printMeny();
            valg = scan.nextInt();

        switch (valg) {
            case 1:
                BrukerInput.hilsen();
                break;
            case 2:
                BrukerInput.sumToTall(scan);
                break;
            case 3:
                BrukerInput.avslutt();
                break;
            default:
                System.out.println("Noe fikk galt, prøv igjen! Skriv inn et tall mellom 1-3");
                break;
        }
        }
        scan.close();
    }
}
