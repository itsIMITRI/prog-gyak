package hu.flowacademy;

public class Kutya {
    private String nev;
    private Integer age;
    private boolean isMale;
    private double hp;
    private String color;

    public Kutya (String nev, Integer age, boolean isMale, double hp, String color){
        this.nev = nev;
        this.age = age;
        this.isMale = isMale;
        this.hp = hp;
        this.color = color;
    }

    public String getNev(){
        return nev;
    }
    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String toString(){
        return "Kutya Név: " + nev + " Életkora: " + age + " Életerő: " + hp + " Szőrszíne: " + color + (isMale? " Hím" : " Szuka");
    }
}
