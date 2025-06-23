package Arrays2;
import java.util.ArrayList;
/*Definer følgende helttalls-ArrayList: 1,2,3,4,5,6,7,8,9.
Skriv ut element nummer 3 og 6 med System.out*/


public class Oppgave1 {
    public static void main (String []args){
    ArrayList<Integer>liste = new ArrayList<>();
    for (int i = 1; i < 10; i++) {
        liste.add(i);
    }
    System.out.println("Element nummer 3 er " + liste.get(3));
    System.out.println("Element nummer 6 er " + liste.get(6));
}
}