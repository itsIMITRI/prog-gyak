package hu.flowacademy;

import hu.flowacademy.butorgyar.Butor;
import hu.flowacademy.butorgyar.Butorlap;

public class Butorka {

    public static void main(String[] args) {

        Butor asztal = new Butor();
        Butorlap lap1 = new Butorlap(40, 30, true);
        Butorlap lap2 = new Butorlap(50, 20, false);
        asztal.lapHozzaad(lap1);
        asztal.lapHozzaad(lap2);
        System.out.println(asztal);
    }

}
