package ProveEksamen;

import java.util.ArrayList;

interface Transport {
    double calculateCost(int distance); // i meter
    double calculateTime(int distance, int minutesTilNextTransport);
}

class Train implements Transport {
    private static final double COST_PER_METER = 0.01;
    private static final double TIME_PER_1000_M = 0.5;

    //koster 0,01 kr per meter.
    public double calculateCost(int distance) {
        return distance * COST_PER_METER;
    }
    //bruker 0,5 min per 1000 m, og det er 30 min til neste tog
    public double calculateTime(int distance, int minutesTilNextTransport) {
        double timeSpend = distance/1000 * TIME_PER_1000_M;
        return timeSpend + minutesTilNextTransport;
    }

    @Override
    public String toString(){
        return "Train";
    }
}

class Taxi implements Transport {
    private static final double BASE_COST = 50;
    private static final double COST_PER_METER = 0.05;
    private static final double TIME_PER_1000_M = 1.0;


    //koster 0,05 kr per meter og har en grunnkostnad på 50 kr.
    public double calculateCost(int distance) {
        return BASE_COST + (distance * COST_PER_METER);
    }

    //bruker 1 min per 1000 m og har en ventetid på 5 min.
    public double calculateTime(int distance, int minutesTilNextTransport) {
        double travelTime = (distance / 1000.0) * TIME_PER_1000_M;
        return travelTime + minutesTilNextTransport;
    }

    @Override
    public String toString(){
        return "Taxi";
    }

}
public class Oppgave5 {
    public static void main(String[] args) {
        /*I en Main-metode, legg de to klassene i et felles array eller en liste, og
        beregn kostnaden og tiden for 1000 m, 5000 m og 50000 m.*/
        ArrayList<Transport> transpotArrayList = new ArrayList<>();
        Transport train = new Train();
        Transport taxi = new Taxi();

        transpotArrayList.add(train);
        transpotArrayList.add(taxi);




    }
}
