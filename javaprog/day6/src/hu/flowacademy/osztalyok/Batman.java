package hu.flowacademy.osztalyok;

import hu.flowacademy.interfacek.Milliardos;
import hu.flowacademy.interfacek.Szuperhos;

public class Batman implements Milliardos, Szuperhos {

        double lelemenyesseg;

        public Batman(){
            lelemenyesseg = 100;
        }


    @Override
    public void kutyutKeszit() {
        lelemenyesseg+=50;
    }

    @Override
    public boolean legyoziE(Szuperhos s) {
        return(s.mekkoraAzEreje() < lelemenyesseg);
        }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg*2;
    }

    public String toString(){
            return "Batman leleményessége: " + lelemenyesseg;
    }
}

//• Írj egy Batman osztályt, ami implementálja a Szuperhos és Milliardos interfészeket.
//– Az osztálynak legyen egy lebegőpontos lelemenyesseg adattagja. – Az osztály rendelkezzen egy
//default konstruktorral, ami 100-ra állítja az adattag értékét. A metódusai az alábbiak szerint
//legyenek megvalósítva: Batman ereje a leleményességének kétszeresével egyezik meg, és
//bármilyen Szuperhőst képes legyőzni, akinek ereje kisebb, mint Batman leleményessége. Ha
//Batman kütyüt készít, akkor a leleményessége 50-el nő.