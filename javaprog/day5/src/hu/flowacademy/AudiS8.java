package hu.flowacademy;

public class AudiS8 extends Jarmu{

    private boolean lezerBlokkolo;

    public AudiS8(String rendszam, int sebesseg, boolean lezerBlokkolo){
        super(sebesseg, rendszam);
        this.lezerBlokkolo = lezerBlokkolo;
    }

    public boolean gyorshajtottE(int sebessegkorlat){
        if(sebessegkorlat < sebessegkorlat){
            return false;
        }   else if(lezerBlokkolo){
            return false;
        }
        return true;
    }

    public String toString(){
        return "Auti " + super.toString();
    }
}
