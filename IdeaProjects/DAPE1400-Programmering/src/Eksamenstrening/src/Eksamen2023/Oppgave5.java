package Eksamen2023;
import java.util.ArrayList;

class Bok {
    private String tittel;
    private String fortfatter;
    private double pris;

    public Bok(String tittel, String fortfatter, double pris) {
        this.tittel = tittel;
        this.fortfatter = fortfatter;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Bok: " +
                "tittel = " + tittel + "\''" +
                ", fortfatter = " + fortfatter + '\'' +
                ", pris = " + pris +
                " }";
    }
}

class Papirbok extends Bok {
    private int ISBN;

    public Papirbok(String tittel, String fortfatter, double pris, int ISBN) {
        super(tittel, fortfatter, pris);
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + "Papirbok{" +
                "ISBN=" + ISBN +
                '}';
    }
}

class Lydbok extends Bok {
    private int lengdeminutter;

    public Lydbok(String tittel, String fortfatter, double pris, int lengdeminutter) {
        super(tittel, fortfatter, pris);
        this.lengdeminutter = lengdeminutter;
    }

    @Override
    public String toString() {
        return super.toString() +"Lydbok{" +
                "lengdeminutter=" + lengdeminutter +
                '}';
    }
}

public class Oppgave5 {
    public static void main(String[] args) {
        Lydbok lydbok1 = new Lydbok("navn", "forfatter", 2000.0, 300);
        Papirbok papirbok1 = new Papirbok("navn", "forfatter", 1000.0, 828282829);

        ArrayList<Bok> bokArray = new ArrayList<>();
        bokArray.add(lydbok1);
        bokArray.add(papirbok1);

        for (Bok bokarrayList : bokArray) {
            System.out.println(bokarrayList);
        }

    }
}
