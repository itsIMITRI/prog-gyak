package hu.flowacademy;

public class Rabok {

    private int id;
    private double bicepsSize;

    public Rabok(int id, double bicepsSize) {
        this.id = id;
        this.bicepsSize = bicepsSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBicepsSize() {
        return bicepsSize;
    }

    public void setBicepsSize(double bicepsSize) {
        this.bicepsSize = bicepsSize;
    }
//. Kérjük be egy rab azonosítóját, majd írassuk ki bicepszének
    //méretét. Ha nincs ilyen azonosítójú rab, akkor jelenjen meg egy erre
    //utaló üzenet.

    public double biceps(int id){
        if(id == this.id){
            return bicepsSize;
        }else{
            System.out.println("nincs ilyen");
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Rab azonosító " + id + ", bicepsz mérete: " + bicepsSize;
    }
}
