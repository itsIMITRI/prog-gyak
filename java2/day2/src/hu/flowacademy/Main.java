package hu.flowacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();

    cars.add(new Car("red", 125, "audi", "a5", 120000));
    cars.add(new Car("blue", 233, "mercedes", "g65", 150000));
    cars.add(new Car("black", 100, "bmw", "m5 e60", 40000));
    cars.add(new Car("white", 170, "chevrolet", "camaro", 150000));


    }
}
