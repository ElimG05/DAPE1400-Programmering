package EgneEksamensOppgaver;

class Kalkulator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int[] numbers) {
        int sum = 0;
        for(int newList : numbers) {
            sum+=newList;
        }
        return sum;
    }

}
public class Oppgave2 {
    public static void main(String[] args) {
        int[]list1 = {1,2,3,4,5,6,7,8,9};

        System.out.println( Kalkulator.add(2,3));
        System.out.println(Kalkulator.add(2.5,1.5));
        System.out.println(Kalkulator.add(list1));
    }


}
