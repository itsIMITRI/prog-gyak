package hu.flowacademy;

import hu.flowacademy.penz.Penz;
import hu.flowacademy.penz.Penztarca;

public class Main {

    public static void main(String[] args) {
        Penztarca buci = new Penztarca();
        Penz tizes = new Penz(10,false);
        Penz ezres = new Penz(1000, true);
        Penz szazas = new Penz(100,false);

        System.out.println(tizes);
        System.out.println(szazas);
        System.out.println(ezres);

        buci.penzBetesz(tizes);
        buci.penzBetesz(ezres);
        buci.penzBetesz(ezres);
        buci.penzBetesz(ezres);
        buci.penzBetesz(szazas);


        System.out.println(buci.penzSzamol(10));
        System.out.println(buci.penzSzamol(100));
        System.out.println(buci.penzSzamol(1000));
        System.out.println(buci.penzSzamol(true));
    }
}
