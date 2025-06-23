package Eksamen2023;

class Skatt {
    private String navn;
    private String adresse;
    private double lonn;
    private double skatt;

    public Skatt(String navn, String adresse, double lonn) {
        this.navn = navn;
        this.adresse = adresse;
        this.lonn = lonn;
        this.skatt = 0;
    }

    public void beregn() {
        if (lonn < 50000) {
            skatt = 0; // betaler ikke skatt
        }
        else if (lonn <= 150000) {
            skatt = 0.25 * lonn; // 25 % skatt
        }
        else {
            skatt = 0.35 * lonn; // 35 % skatt
        }
    }

    @Override
    public String toString() {
        return navn + ", " + adresse + "\n" + "Lønn: " + lonn + " Skatt: " + skatt;
    }

}


public class Oppgave3 {
    public static void main(String[] args) {
        Skatt per = new Skatt("Per Hansen","Osloveien 82 0150 Oslo",40000.0);
        per.beregn();
        System.out.println(per);
    }

}
