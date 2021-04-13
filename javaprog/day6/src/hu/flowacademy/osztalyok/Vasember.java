package hu.flowacademy.osztalyok;

import hu.flowacademy.interfacek.Milliardos;

public class Vasember extends Bosszuallo implements Milliardos {

    public Vasember(){
        super(150, true);

    }

    public void kutyutKeszit(){
        double szuperero = getSzuperero();
        double novekedes = Math.random() * 10;
        setSzuperero(szuperero + novekedes);
    }

    public boolean megmentiAVilagot(){
        return getSzuperero() > 1000;
    }

    @Override
    public String toString() {
        return "Vasember{" + super.getSzuperero() + " " + super.isVanEGyengesege() + " }";
    }
}
