package hu.flowacademy;

public class Allat {
    private String nev;
    private boolean isMale;
    private int numberOfLegs;

    public Allat(String nev, boolean isMale, int numberOfLegs){
        this.nev = nev;
        this.isMale = isMale;
        this.numberOfLegs = numberOfLegs;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getNev() {
        return nev;
    }

    public boolean setisMale() {
        return isMale;
    }

    public void hangotAd(){
        System.out.println("Állat vagyok");
    }
}
