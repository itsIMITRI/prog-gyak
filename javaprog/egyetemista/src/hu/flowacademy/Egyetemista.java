package hu.flowacademy;

public class Egyetemista extends Egyetem{
    public Egyetemista(int id) {
        super(id);
    }


    public void tanul(int perc) {
        setTanulasIdo(getTanulasIdo() + perc);
    }

    public void kocsmazik(double centi){
        setAlkohol(getAlkohol() + centi);
    }

    public String toString(){
        return "Mai egyetemista " + getId() + " ennyit percet tanult:" + getTanulasIdo() + " és ennyi alkoholt fogyasztott: " + getAlkohol();
    }
}
