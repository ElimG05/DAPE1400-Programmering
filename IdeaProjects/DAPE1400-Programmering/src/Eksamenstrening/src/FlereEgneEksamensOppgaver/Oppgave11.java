package FlereEgneEksamensOppgaver;

import java.util.Random;

public class Oppgave11 {
    public static void main(String[] args) {
        int[][] todimensjonalArray = new int[5][5];
        Random randomArray = new Random();

        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
              todimensjonalArray[i][j] = randomArray.nextInt(100)+1;
              System.out.print(todimensjonalArray[i][j] + " \t");
            }
            System.out.println();
        }

        //b)
        System.out.println("\nSum av hver rad:");
        int radSum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                radSum  += todimensjonalArray[i][j];
            }
            System.out.println("Rad " + (i + 1) + " -> " + radSum);
        }

        System.out.println("\nSum av hver kolonne:");
        int kolonneSum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                kolonneSum += todimensjonalArray[j][i];
            }
            System.out.println("Kolonne " + (i + 1) + " -> " + kolonneSum);
        }

        //c)
        int hoveddiagonalenSum = 0;
        int sekundarDiagonalen = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    hoveddiagonalenSum  += todimensjonalArray[i][j];
                    sekundarDiagonalen += todimensjonalArray[i][todimensjonalArray.length-1-i];
                }
            }
        }
        System.out.println("\nSum av hoveddiagonalen: " + hoveddiagonalenSum);
        System.out.println("Sum av sekundardiagonalen: " + sekundarDiagonalen);

    }
}
