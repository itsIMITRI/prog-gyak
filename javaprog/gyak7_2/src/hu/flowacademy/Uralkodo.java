package hu.flowacademy;
//– Az osztálynak legyen egy lebegőpontos gonoszsag adattagja.
//– Az osztály rendelkezzen egy default konstruktorral, ami 100-ra állítja az adattag értékét. A metódusai az alábbiak szerint legyenek megvalósítva: az Uralkodo ereje a
//gonoszságának kétszeresével egyezik meg, és bármilyen EroErzekeny-t képes legyőzni,
//akinek ereje kisebb, mint az Uralkodó gonoszsága. Ha az Uralkodo elengedi a haragját, akkor gonoszsága 50-el nő.
//– Az osztály legyen szöveges formára alakítható, ami kiírja, hogy az Uralkodóról van
//szó, és megadja a gonoszságát.
public class Uralkodo implements EroErzekeny, Sith{

        double gonoszsag;

        public Uralkodo(){
            gonoszsag = 100;
        }

    @Override
    public double mekkoraAzEreje() {
        return gonoszsag*2;
    }

    @Override
    public boolean legyoziE(EroErzekeny e) {
        return(e.mekkoraAzEreje()< gonoszsag);
    }

    @Override
    public void engeddElAHaragod() {
        gonoszsag+=50;
    }

    @Override
    public String toString() {
        return "Uralkodo gonoszsága: "  +gonoszsag;
    }
}
