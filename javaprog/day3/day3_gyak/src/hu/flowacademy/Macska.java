package hu.flowacademy;

public class Macska {
    private String name;
    private double weight;
    private  boolean hungry;


    public Macska (String name, double weight, boolean hungry){
        this.name = name;
        this.weight = weight;
        this.hungry = hungry;
    }

    public boolean eszik(double food) {
        if(this.hungry){
            this.hungry=false;
            this.weight+=food;
            return true;
        }else{
        return false;
    }
    }

    public void futkos(){
        this.weight-=0.1;
        if(!this.hungry){
            this.hungry=true;
        }
    }

    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public boolean getHungry(){
        return hungry;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String toString(){
        return "Név: " + name + " Súly: " + weight + (hungry? " éhes" : " nem éhes");
    }

}
