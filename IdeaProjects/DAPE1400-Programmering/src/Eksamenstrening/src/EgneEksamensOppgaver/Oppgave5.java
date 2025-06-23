package EgneEksamensOppgaver;

interface Betaling{
     void betal(double beløp);
}

class Kortbetaling implements Betaling {
    public void betal(double beløp) {
        System.out.println("Betalt med kort: " + beløp + " kr");
    }

}

class Vippsbetaling implements Betaling {
    public void betal(double beløp) {
        System.out.println("Betalt med vipps: " + beløp + " kr");

    }
}


public class Oppgave5 {
    public static void main(String[] args) {
        Kortbetaling betalMKort = new Kortbetaling();
        Vippsbetaling betalMVipps = new Vippsbetaling();
        betalMKort.betal(25.5);
        betalMVipps.betal(20.5);

    }
}
