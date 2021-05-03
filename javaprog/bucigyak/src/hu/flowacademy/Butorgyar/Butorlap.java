package hu.flowacademy.Butorgyar;

public class Butorlap {
    protected double hossz;
    protected double szelesseg;
    protected boolean isHatlap;

    protected final int tartolapAr = 5000;
    protected final int hatlapAr = 500;

    public Butorlap(double hossz, double szelesseg, boolean isHatlap){
        this.hossz = hossz/100;
        this.szelesseg = szelesseg/100;
        this.isHatlap = isHatlap;
    }

    public double arSzamol(){
       return (isHatlap ? (hossz * szelesseg) * hatlapAr : (hossz * szelesseg) * tartolapAr);
        }


}
