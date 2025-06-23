package Klasserogobjekter1;
/*Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
tittel
pris
forfatter
iSBN-nummer
Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.
Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier.
Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.*/


class Bøker {
    String tittel;
    double pris;
    String forfatter;
    String iSBN_nummer;

    void skrivUt() {
        System.out.println("Tittelen er: " + tittel);
        System.out.println("Prisen er: " + pris);
        System.out.println("Forfatteren er: " + forfatter);
        System.out.println("iSBN_nummeret er: " + iSBN_nummer );
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        Bøker bok1 = new Bøker();
        bok1.tittel = "It ends with us";
        bok1.pris = 169.00;
        bok1.forfatter = "Colleen Hoover";
        bok1.iSBN_nummer = "9783844918410";
        bok1.skrivUt();
    }
}
