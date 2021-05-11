package hu.flowacademy;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        List<String> nevek = new ArrayList<>();
        nevek.add("Feri");
        nevek.add("Józsi");
        nevek.add("Peti");
        nevek.add("Pisti");
        nevek.add("Frici");
        nevek.add("Galamb");

        for ( String nev : nevek){
            System.out.println(nev);
        }

        for (int i = 0; i < nevek.size(); i+=2){
            nevek.remove(i);
            i--;
        }

        System.out.println();

        for ( String nev : nevek){
            System.out.println(nev);
        }
    }
}
