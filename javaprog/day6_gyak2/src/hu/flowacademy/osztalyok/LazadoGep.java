package hu.flowacademy.osztalyok;

import hu.flowacademy.interfacek.Urhajo;

public abstract class LazadoGep implements Urhajo {

    protected double sebesseg;
    protected boolean meghibasodhatE;

    public LazadoGep(double sebesseg, boolean meghibasodhatE){
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;
    }

    public abstract boolean elkapjaAVonosugar();

    public double getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public boolean isMeghibasodhatE() {
        return meghibasodhatE;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }
//Egy LazadoGep egy másik LazadoGep objektumot akkor tud legyorsulni, ha az meghibásodhat, és
//a gyorsasága kisebb, mint az övé. A MilleniumFalcon objektumot csak akkor tudja legyőzni, ha
//gyorsasága kétszer nagyobb.
    @Override
    public boolean legyorsuljaE(Urhajo u) {
        if(u instanceof LazadoGep){
            if(u.milyenGyors() < milyenGyors() && ((LazadoGep) u).meghibasodhatE){
                return true;
            }
        }else if(u.milyenGyors()*2 <= milyenGyors() ){
                return true;
        }
        return false;
    }

    @Override
    public double milyenGyors() {
        return sebesseg;
    }

    public String toString(){
        return "A lázadógép sebessége: " + sebesseg + (meghibasodhatE? " és meghibásodhat" : " és nem hibásodhat meg.");
    }
}
