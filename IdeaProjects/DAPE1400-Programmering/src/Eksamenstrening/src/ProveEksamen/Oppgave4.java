package ProveEksamen;

class Smartligth {
    private int brightnessPercentage;
    private boolean isOn;

    public Smartligth(int brightnessPercentage, boolean isOn) {
        this.brightnessPercentage = brightnessPercentage;
        this.isOn = isOn;
    }

    public int getBrightnessPercentage() {
        return brightnessPercentage;
    }

    public void setBrightnessPercentage(int brightnessPercentage) {
        if (brightnessPercentage>=0 && brightnessPercentage <=100 ) {
            this.brightnessPercentage = brightnessPercentage;
        }
        else {
            System.out.println("Lysstyrken kan kun være mellom 0-100.");

        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}

class SmartLamp {
    public Smartligth installedBulb;
    public String wifiName;

    public SmartLamp(String wifiName) {
        this.wifiName = wifiName;
        this.installedBulb = null; //SmartLamp kan initialiseres uten en lyspære
    }

    public Smartligth getInstalledBulb() {
        return installedBulb;
    }

    public void setInstalledBulb(Smartligth installedBulb) {
        this.installedBulb = installedBulb;

    }

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public void setBrightness(int brightnessPercentage) { //setter lysstyrken (brightness) til SmartLight som er installert i SmartLampen
        if (installedBulb != null) {
            installedBulb.setBrightnessPercentage(brightnessPercentage);
        } else {
            System.out.println("Ingen SmartLight er instalert i SmartLamp.");
        }
    }
}

public class Oppgave4 {
}
