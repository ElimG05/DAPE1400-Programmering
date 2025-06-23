package EgneEksamensOppgaver;

//se over oppgaven og gjør den ferdig

import java.util.ArrayList;

abstract class Transportsmiddel{
    private double hastighet;
    private String navn;

    public Transportsmiddel(String navn, double hastighet) {
        this.navn = navn;
        this.hastighet = hastighet;
    }

    abstract void kjor();

    @Override
    public String toString() {
        return "hastighet = " + hastighet +
                " km/h, " + navn;
    }
}

class Bil extends Transportsmiddel {
    public Bil(String navn, double hastighet) {
        super(navn, hastighet);
    }

    @Override
    void kjor() {
        System.out.println("Bil: " + toString() + " kjører.");
    }


    public void fyllBensin() {
        System.out.println("Du må fylle bensin");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class Sykkel extends Transportsmiddel{

    public Sykkel(String navn, double hastighet) {
        super(navn, hastighet);
    }

    @Override
    void kjor() {
        System.out.println(toString() + " triller.");
    }

    public void smørKjede() {
        System.out.println("Du må smøre kjedene til sykkelen");
    }

    @Override
    public String toString() {
        return "Sykkel: " + super.toString();
    }
}


public class Oppgave4 {
    public static void main(String[] args) {
        ArrayList<Transportsmiddel> transportsmiddelsListe = new ArrayList<>();
        Transportsmiddel bil1 = new Bil("Volvo", 30.0);
        Transportsmiddel bil2 = new Bil("Ford", 55.5);
        Transportsmiddel sykkel1 = new Sykkel("BMX-sykkel", 5.0);
        Transportsmiddel sykkel2 = new Sykkel("Racersykkel", 2.2);

        transportsmiddelsListe.add(bil1);
        transportsmiddelsListe.add(bil2);
        transportsmiddelsListe.add(sykkel1);
        transportsmiddelsListe.add(sykkel2);

        for (Transportsmiddel transportsmiddel : transportsmiddelsListe) {
            transportsmiddel.kjor();
        }


    }
}
