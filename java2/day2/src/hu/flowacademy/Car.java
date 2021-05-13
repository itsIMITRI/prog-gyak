package hu.flowacademy;

import java.util.Comparator;

public class Car implements Comparator<Car> {

    private String color;
    private int kW;
    private String company;
    private String type;
    private int price;

    public Car(String color, int kW, String company, String type, int price) {
        this.color = color;
        this.kW = kW;
        this.company = company;
        this.type = type;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getkW() {
        return kW;
    }

    public void setkW(int kW) {
        this.kW = kW;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", kW=" + kW +
                ", company='" + company + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
