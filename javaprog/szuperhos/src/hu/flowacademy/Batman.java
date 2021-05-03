package hu.flowacademy;

public class Batman implements Szuperhos, Milliardos{

    private double lelemenyesseg;

    public Batman (){
        this.lelemenyesseg = 100;

    }


    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos s) {
        if( s.mekkoraAzEreje() < lelemenyesseg){
            return true;
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg*2;
    }

    public String toString(){
        return "Batman leleményessége: " + lelemenyesseg;
    }
}
