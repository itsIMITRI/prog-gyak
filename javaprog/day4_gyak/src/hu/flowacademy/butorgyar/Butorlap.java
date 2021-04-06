package hu.flowacademy.butorgyar;

public class Butorlap {

    int hossz;
    int szelesseg;
    boolean isTartolap;
    final int TARTOLAPAR = 500;
    final int HATLAPAR = 5000;


    public Butorlap(int hossz, int szelesseg,  boolean isTartolap) {
        this.hossz = hossz;
        this.szelesseg = szelesseg;
        this.isTartolap = isTartolap;
    }

    @Override
    public String toString() {
        return "Butorlap{" +
                "hossz=" + hossz +
                ", szelesseg=" + szelesseg +
                ", isTartolap=" + isTartolap +
                ", TARTOLAPAR=" + TARTOLAPAR +
                ", HATLAPAR=" + HATLAPAR +
                '}';
    }

    public double arSzamol(){
        if(isTartolap){
            return ((hossz * szelesseg)/100) * TARTOLAPAR;
        }else{
            return ((hossz * szelesseg)/100) * HATLAPAR;
        }


    }
}
