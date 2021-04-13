package hu.flowacademy;

public class Robogo extends Jarmu {

    private int maxSebesseg;

    public Robogo(String rendszam, int sebesseg, int maxSebesseg) {
        super(sebesseg, rendszam);
        this.maxSebesseg = maxSebesseg;
    }

    public boolean gyorshajtottE(int sebessegkorlat){
        return sebesseg > sebessegkorlat;
    }

    public String toString(){
        return "Robogo: " + super.toString();
    }
}