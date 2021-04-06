package hu.flowacademy;

public class Tigris extends Allat{

    boolean karom;
    public Tigris(String nev, boolean isMale, int numberOfLegs, boolean karom){
        super(nev, isMale, numberOfLegs);
        this.karom = karom;
    }

    public void hangotAd(){
        System.out.println("Tigris vagyok");
    }
}
