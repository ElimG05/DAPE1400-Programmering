package ProveEksamen;
import java.util.InputMismatchException;
import java.util.Scanner;

class Meny {

    public static void displayWordOfWisdom() {
        System.out.println("Dagens visdomsord.....\n");

    }

    public static void displayWeather() {
        System.out.println("Dagens vær....\n");

    }

    public static void exitProgram() {
        System.out.println("Programmet er avsluttet. Ha en fin dag videre!");

    }
}


public class Oppgave2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String viktigMelding = "Vennligst velg et tall mellom 1 og 3";
        int valg = 0;
        while (valg != 3) {
            System.out.println("Du har tre valg (1-3):");
            System.out.println("1. Motta dagens visdomsord");
            System.out.println("2. Vis været");
            System.out.println("3. Avslutt programmet");
            boolean brukerInput = false;

            while (!brukerInput) {
                try {
                    valg = scan.nextInt();
                    if (valg > 0 && valg < 4) {
                        brukerInput = true;
                    } else {
                        System.out.println(viktigMelding);
                    }
                } catch (InputMismatchException e) {
                    System.out.println(viktigMelding);
                    scan.nextLine();
                }
            }
            switch (valg) {
                case 1 -> Meny.displayWordOfWisdom();
                case 2 -> Meny.displayWeather();
                case 3 -> Meny.exitProgram();
                default -> System.out.println(viktigMelding);

            }
        }
        scan.close();
    }
}