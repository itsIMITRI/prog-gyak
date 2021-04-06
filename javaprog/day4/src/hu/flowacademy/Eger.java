package hu.flowacademy;

public class Eger extends Allat{
    boolean szeretiASajtot;
    public Eger(String nev, boolean isMale, int numberOfLegs, boolean szeretiASajtot){
        super(nev, isMale, numberOfLegs);
        this.szeretiASajtot = szeretiASajtot;
    }

    public void hangotAd(){
        System.out.println("Egér vagyok");
    }

}
