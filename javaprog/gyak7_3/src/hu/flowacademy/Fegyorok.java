package hu.flowacademy;

public class Fegyorok {

    private String id;
    private double bicepsSize;

    public Fegyorok(String id, double bicepsSize){
        this.id = id;
        this.bicepsSize = bicepsSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBicepsSize() {
        return bicepsSize;
    }

    public void setBicepsSize(double bicepsSize) {
        this.bicepsSize = bicepsSize;
    }



    @Override
    public String toString() {
        return "Fegyorok{" +
                "id='" + id + '\'' +
                ", bicepsSize=" + bicepsSize +
                '}';
    }
}
