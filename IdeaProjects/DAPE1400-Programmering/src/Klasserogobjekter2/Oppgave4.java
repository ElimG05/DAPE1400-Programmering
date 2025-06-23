package Klasserogobjekter2;
import static javax.swing.JOptionPane.*;

/*Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.

Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).

Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.

Skriv så kode i main for å teste ut denne klassen.*/

class Klokke {
    private int time;
    private int minutter;
    private int sekunder;

    //ligger til set- i konstruktøren slik at vi kan sjekke at inndatene er korekte
    public Klokke(int time, int minutter, int sekunder){
        setTime(time);
        setMinutter(minutter);
        setSekunder(sekunder);
    }

    public int getTime (){
        return time;
    }

    public void setTime (int time){
        if(time >= 0 && time <= 24){
            this.time = time;
        }
    }

    public int getMinutter(){
        return minutter;
    }
    public void setMinutter (int minutter) {
        if (minutter >= 0 && minutter <= 59) {
            this.minutter = minutter;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder (int sekunder){
        if(sekunder >= 0 && sekunder <= 59){
            this.sekunder = sekunder;}
        }


    public void visTiden(){
        showMessageDialog(null, "Klokken er " + time + ":" + minutter + ":" + sekunder);

    }
}



public class Oppgave4 {
    public static void main(String[] args) {
        Klokke nyTid1 = new Klokke (12,00,30);
        nyTid1.visTiden();

        Klokke nyTid2 = new Klokke (29,71,3);
        nyTid2.visTiden();



    }
}
