package FlereEgneEksamensOppgaver;

import java.util.*;

public class Oppgave14 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        Random random = new Random();

        System.out.println("Liste med tilfeldige heltall mellom 1 og 50:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
            System.out.println(array[i]);
        }

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));


        arrayList.add(6);
        arrayList.add(16);
        arrayList.add(26);

        System.out.println("Listen i stigende rekkefølge med 3 flere tall:");
        Collections.sort(arrayList);
        for (Integer nyListe : arrayList) {
            System.out.println(nyListe);
        }


        for (int i=0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 30) {
                arrayList.remove(i);
                i--;
            }
        }

        System.out.println("Listen etter å ha fjernet tall som er større enn 30:");
        for (Integer nyListe : arrayList) {
            System.out.println(nyListe);
        }









    }
}
