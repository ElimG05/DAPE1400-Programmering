package FlereEgneEksamensOppgaver;

class SmartKjøleskap {
    private int temperatur;
    private String merke;
    private String modell;
    private double kapasitet;
    private boolean erTilkoblet;

    public SmartKjøleskap(int temperatur, String merke, String modell, boolean erTilkoblet, double kapasitet) {
        this.temperatur = temperatur;
        this.merke = merke;
        this.modell = modell;
        this.erTilkoblet = erTilkoblet;
        this.kapasitet = kapasitet;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        if (temperatur >= -20 && temperatur < 10) {
            this.temperatur = temperatur;
        }
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public double getKapasitet() {
        return kapasitet;
    }

    public void setKapasitet(double kapasitet) {
        this.kapasitet = kapasitet;
    }

    public boolean isErTilkoblet() {
        return erTilkoblet;
    }

    public void setErTilkoblet(boolean erTilkoblet) {
        this.erTilkoblet = erTilkoblet;
    }
}

class SmartVaskemaskin{
    private String aktivtProgram;
    private String standarProgram;
    private int temperatur;
    private String merke;
    private String modell;
    private double kapasitet;

    public SmartVaskemaskin(String aktivtProgram, double kapasitet, String modell, String merke, int temperatur) {
        this.aktivtProgram = aktivtProgram;
        this.kapasitet = kapasitet;
        this.modell = modell;
        this.merke = merke;
        this.standarProgram = "Normalvask";
        this.temperatur = temperatur;
    }

    public SmartVaskemaskin(double kapasitet, String modell, String merke, String standarProgram) {
        this.aktivtProgram = "Normalvask";
        this.kapasitet = kapasitet;
        this.modell = modell;
        this.merke = merke;
        this.standarProgram = standarProgram;
        this.temperatur = 30;
    }

    public String getAktivtProgram() {
        return aktivtProgram;
    }

    public void setAktivtProgram(String aktivtProgram) {
        this.aktivtProgram = aktivtProgram;
    }

    public String getStandarProgram() {
        return standarProgram;
    }

    public void setStandarProgram(String standarProgram) {
        this.standarProgram = standarProgram;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public double getKapasitet() {
        return kapasitet;
    }

    public void setKapasitet(double kapasitet) {
        this.kapasitet = kapasitet;
    }
}

public class Oppgave17 {
}
