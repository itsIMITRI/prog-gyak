package hu.flowacademy;

public class Vasember extends Bosszuallo implements Milliardos{

        public Vasember(){
            super(150,true);
        }


    @Override
    public boolean megmentiEAVilagot() {
        if(getSzuperero() > 1000){
            return true;
        }
        return false;
    }

    @Override
    public void kutyutKeszit() {
        setSzuperero(getSzuperero() + Math.floor(Math.random()*10));
    }

    public String toString(){
            return "Vasember ereje: " + getSzuperero() + (isVanEGyengesege() ? " és van gyengesége" : " és nincs gyengesége");
    }
}
