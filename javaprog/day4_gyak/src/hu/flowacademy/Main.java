package hu.flowacademy;

import hu.flowacademy.butorgyar.Butor;
import hu.flowacademy.butorgyar.Butorlap;

public class Main {

    public static void main(String[] args) {

        Butorlap elso = new Butorlap(120,55,true);
        Butorlap masodik = new Butorlap(112,40, false);
        Butor szek = new Butor();
        System.out.println(elso.arSzamol());
        System.out.println(masodik.arSzamol());

        szek.lapHozzaad(elso);
        szek.lapHozzaad(masodik);

        System.out.println(szek);


    }
}
