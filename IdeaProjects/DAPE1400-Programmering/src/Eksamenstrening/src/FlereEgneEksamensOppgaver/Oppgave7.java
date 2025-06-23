package FlereEgneEksamensOppgaver;

import java.util.ArrayList;

abstract class Kjoretoy {
   public abstract int maksHastighet();

    public static void kjor(){
        System.out.println("Kjøretøyet er i gang");
    }

}


class Bil extends Kjoretoy{
    private int antallSeter;

    public Bil(int antallSeter) {
        this.antallSeter = antallSeter;
    }

    @Override
    public int maksHastighet() {
        return 200;
    }

    @Override
    public String toString() {
        return "Denne bilen har " + antallSeter + " seter og har en maks hastlighet på " + maksHastighet() + " km/h";
    }
}

class Sykkel extends Kjoretoy {
    private String type;

    public Sykkel(String type) {
        this.type = type;
    }

    @Override
    public int maksHastighet() {
        return 50;
    }

    @Override
    public String toString() {
        return "Denne sykkelen er av type " + type + " og har en maks hastlighet på " + maksHastighet() + " km/h";
    }
}

public class Oppgave7 {
    public static void main(String[] args) {
        ArrayList<Kjoretoy> kjoretoyList = new ArrayList<>();

        Kjoretoy bil1 = new Bil(2);
        Kjoretoy bil2 = new Bil(5);
        Kjoretoy sykkel1 = new Sykkel("Terrengsykkel");
        Kjoretoy sykkel2 = new Sykkel("Hybridsykkel");


        kjoretoyList.add(bil1);
        kjoretoyList.add(bil2);
        kjoretoyList.add(sykkel1);
        kjoretoyList.add(sykkel2);


        for (Kjoretoy nyListe : kjoretoyList) {
            Kjoretoy.kjor();
            System.out.println(nyListe.toString());
            System.out.println();
        }


    }
}
