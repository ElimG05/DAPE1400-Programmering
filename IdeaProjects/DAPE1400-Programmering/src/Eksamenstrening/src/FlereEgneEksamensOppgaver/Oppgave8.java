package FlereEgneEksamensOppgaver;

import java.util.ArrayList;

class ArrayHandler {

    public static int sumArray(int[] vanligArray){
        int sum = 0;
        for (int i = 0; i < vanligArray.length; i++) {
            sum += vanligArray[i];
        }
        return sum;
    }

    public static int sumArray(int[][] todimensjonalArray){
        int sum = 0;
        for (int i = 0; i < todimensjonalArray.length; i++) {
            for (int j = 0; j < todimensjonalArray[i].length; j++) {
                sum += todimensjonalArray[i][j];
            }
        }
        return sum;
    }

    public static void printBeggeDiagonalene(int[][] todimensjonalArray) {
        System.out.println("Hoveddiagonalen:");
        for (int i = 0; i < todimensjonalArray.length; i++) {
            System.out.println(todimensjonalArray[i][i]);
        }

        System.out.println("Andre diagonalen:");
        for (int i = 0; i < todimensjonalArray.length; i++) {
            System.out.println(todimensjonalArray[i][todimensjonalArray.length - 1 - i]);
        }
    }
}

public class Oppgave8 {
    public static void main(String[] args) {
        int[] vanligArray = {1,2,3,4,5,6,7,8,9};
        int[][] todimensjonalArray = {{1,2,3},{4,5,6},{7,8,9}};


        System.out.println("Summen av et array av heltall: " + ArrayHandler.sumArray(vanligArray));
        System.out.println("Summen av et 2D-array av heltall " + ArrayHandler.sumArray(todimensjonalArray));
        System.out.println("De diagonale elementene");
        ArrayHandler.printBeggeDiagonalene(todimensjonalArray);
    }
}
