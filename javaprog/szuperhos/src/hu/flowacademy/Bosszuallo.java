package hu.flowacademy;

public abstract class Bosszuallo implements Szuperhos{

    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege){
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiEAVilagot();


    @Override
    public boolean legyoziE(Szuperhos s) {
        if(s instanceof Bosszuallo){
            if(((Bosszuallo) s).vanEGyengesege && s.mekkoraAzEreje() < mekkoraAzEreje()){
                return true;
            }
           else if(s instanceof Batman){
               if(s.mekkoraAzEreje() * 2 < mekkoraAzEreje()){
                   return true;
               }
            }
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }
}
