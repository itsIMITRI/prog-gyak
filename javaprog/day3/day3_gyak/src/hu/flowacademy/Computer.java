package hu.flowacademy;

public class Computer {
    private double freeMem;
    private boolean isOn;

    public Computer(double freeMem, boolean isOn){
        this.freeMem = freeMem;
        this.isOn = isOn;
    }

    public double getFreeMem(){
        return freeMem;
    }

    public boolean getisOn() {
        return isOn;
    }

    public void setOn(boolean isOn){
        this.isOn = isOn;
    }

    public void kapcsol(){
        if(isOn){
            isOn=false;
        }else{
            isOn=true;
        }
    }
    public boolean programMasol(double meret){
        if(isOn && freeMem>=meret){
            freeMem-=meret;
            return true;
        }
        return false;
    }

    public String toString(){
        return  "A gép memóriája: " + freeMem + " MB" + " és " + (isOn ? " be van kapcsolva." : " nincs bekapcsolva.");
    }

}
