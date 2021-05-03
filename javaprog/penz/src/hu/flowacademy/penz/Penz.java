package hu.flowacademy.penz;

public class Penz {
    protected int ertek;
    protected boolean isPapir;

    public Penz(int ertek, boolean isPapir){
        this.ertek = ertek;
        this.isPapir = isPapir;
    }

    public String toString(){
        return ertek + " Ft " + (isPapir ? "Papírpénz" : "Aprópénz");
    }
}
