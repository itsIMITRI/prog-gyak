package hu.flowacademy.osztalyok;

import hu.flowacademy.interfacek.Hiperhajtomu;
import hu.flowacademy.interfacek.Urhajo;

public class MilleniumFalcon implements Urhajo, Hiperhajtomu {

    protected double tapasztalat;

    public MilleniumFalcon(){
        this.tapasztalat = 100;
    }


    @Override
    public void hiperUgras() {
        tapasztalat+=500;
    }

    @Override
    public boolean legyorsuljaE(Urhajo u) {
        return (u.milyenGyors()<milyenGyors());
    }

    @Override
    public double milyenGyors() {
        return tapasztalat*2;
    }

    public String toString(){
        return "A Millenium Falcon tapasztalata: " + tapasztalat;
    }
}
