package hu.flowacademy;

public abstract class Egyetem {
    private int id;
    private double alkohol;
    private int tanulasIdo;
    private boolean oranVan;

    public Egyetem(int id){
        this.id = id;
        this.alkohol = 0;
        this.tanulasIdo = 0;
        this.oranVan = false;
    }

    public  void tanul(int perc){
        tanulasIdo += perc;
    }

    public void kocsmazik(double centi){
        alkohol += centi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAlkohol() {
        return alkohol;
    }

    public void setAlkohol(double alkohol) {
        this.alkohol = alkohol;
    }

    public int getTanulasIdo() {
        return tanulasIdo;
    }

    public void setTanulasIdo(int tanulasIdo) {
        this.tanulasIdo = tanulasIdo;
    }

    public boolean isOranVan() {
        return oranVan;
    }

    public void setOranVan(boolean oranVan) {
        this.oranVan = oranVan;
    }
}