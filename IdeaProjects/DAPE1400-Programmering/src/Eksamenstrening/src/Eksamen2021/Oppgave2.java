package Eksamen2021;



public class Oppgave2 {
    public static boolean funnetTallet(int[] array, int tall) {
        for(int undersoker : array ) {
            if(undersoker == tall) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6,7,8,9};

        System.out.println(funnetTallet(testArray,2));
    }
}
