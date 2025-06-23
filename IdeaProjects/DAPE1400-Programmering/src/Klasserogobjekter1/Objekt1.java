package Klasserogobjekter1;

class Bil {
    public String farge;

    public void visFarge() {
        System.out.println("Fargen til bilen er " + farge);
    }

    public void settFarge(String fargen, int alder) {
        farge = fargen;
    }
}


public class Objekt1 {
    public static void main(String[] args) {
        Bil nyBil = new Bil();
        nyBil.settFarge("blå", 10);
        nyBil.visFarge();
    }
}

