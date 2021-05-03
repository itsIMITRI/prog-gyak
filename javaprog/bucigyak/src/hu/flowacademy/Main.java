package hu.flowacademy;

import hu.flowacademy.Butorgyar.Butor;
import hu.flowacademy.Butorgyar.Butorlap;

public class Main {

    public static void main(String[] args) {
	    Butor szek = new Butor();
        System.out.println(szek);
        Butorlap szeklab = new Butorlap(120, 50,true);
        System.out.println(szeklab.arSzamol());
	    szek.lapHozzaad(szeklab);
        System.out.println(szek);
        Butorlap hatlap = new Butorlap(50,50, false);
        szek.lapHozzaad(hatlap);
        System.out.println(szek);
    }
}
