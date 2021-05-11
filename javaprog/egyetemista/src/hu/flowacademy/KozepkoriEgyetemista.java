package hu.flowacademy;

public class KozepkoriEgyetemista extends Egyetem{
    int vitakeszseg;
    public KozepkoriEgyetemista(int id) {
        super(id);
        this.vitakeszseg = 0;
    }

    @Override
    public void tanul(int perc) {
        setTanulasIdo(getTanulasIdo() + perc);
    }

    public void kocsmazik(double centi){
        setAlkohol(getAlkohol() + centi);
    }
    public String toString(){
        return "Középkori egyetemista " + getId() + " ennyit percet tanult:" + getTanulasIdo() + " és ennyi alkoholt fogyasztott: " + getAlkohol();
    }
}
