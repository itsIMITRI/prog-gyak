package hu.flowacademy;
//• Írj egy Jedi absztrakt osztályt, ami implementálja az EroErzekeny interfészt.
//– Az osztály a következő private láthatóságú adattagokkal rendelkezik: egy lebegőpontos ero, és egy logikai atallhatE (átállhat -e a sötét oldalra).
////– Az osztály rendelkezzen paraméteres konstruktorral, ami beállítja az adattagokat. Legyen egy public megteremtiAzEgyensulyt absztrakt metódusa, ami egy logikai értékkel
///tér vissza. Valósítsd meg továbbá az interfész metódusait. Az erő lekérdezésekor add
//vissza a Jedi erejét. Egy Jedi egy másik Jedi objektumot akkor tud legyőzni, ha az
//átállhat a sötét oldalra, és ereje kisebb, mint az övé. Az Uralkodo objektumot csak
//akkor tudja legyőzni, ha ereje kétszer nagyobb.
//– Az osztálynak legyen továbbá getter és setter metódusa az adattagjaihoz, és legyen
//szöveges formára alakítható, kiírva az adattagok értékét.
public abstract class Jedi implements EroErzekeny{
    private double ero;
    private boolean atallhatE;

    public Jedi(double ero, boolean atallhatE) {
        this.ero = ero;
        this.atallhatE = atallhatE;
    }

    public abstract boolean megteremtiAzEgyensulyt();


    @Override
    public boolean legyoziE(EroErzekeny e) {
       if(e instanceof EroErzekeny){
           if(mekkoraAzEreje() > e.mekkoraAzEreje() && atallhatE){
               return true;
           }
       }
    }

    @Override
    public double mekkoraAzEreje() {
        return ero;
    }
    //– Az osztálynak legyen továbbá getter és setter metódusa az adattagjaihoz, és legyen
    //szöveges formára alakítható, kiírva az adattagok értékét.


    public double getEro() {
        return ero;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public boolean getAtallhatE() {
        return atallhatE;
    }

    public void setAtallhatE(boolean atallhatE) {
        this.atallhatE = atallhatE;
    }
}
