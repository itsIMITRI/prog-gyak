package hu.flowacademy.penz;

public class Penz {
   private String nevErtek;
   private boolean isPapir;

    public Penz(String nevErtek, boolean isPapir) {
        this.nevErtek = nevErtek;
        this.isPapir = isPapir;
    }


    public String toString() {
        return nevErtek +  " Ft " + (isPapir? " Papírpénz" : " Aprópénz");
    }
}
