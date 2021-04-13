package hu.flowacademy.osztalyok;

import hu.flowacademy.interfacek.Szuperhos;

public abstract class Bosszuallo implements Szuperhos {

    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos s) {

        if (s instanceof Bosszuallo) {
            if (((Bosszuallo) s).vanEGyengesege && ((Bosszuallo) s).szuperero < this.szuperero) {
                return true;
            } else {
                return false;
            }
        } else if (s instanceof Batman) {
            if (s.mekkoraAzEreje() * 2 <= this.mekkoraAzEreje()) {
                return true;
            }
        }
        return false;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }
}


//• Írj egy Bosszuallo absztrakt osztályt, ami implementálja a Szuperhos interfészt.
//– Az osztály a következő private láthatóságú adattagokkal rendelkezik: egy lebegőpontos szuperero, és egy logikai vanEGyengesege.
//– Az osztály rendelkezzen paraméteres konstruktorral, ami beállítja az adattagokat.
//Legyen egy public megmentiAVilagot absztrakt metódusa, ami egy logikai értékkel
//tér vissza. Valósítsd meg továbbá az interfész metódusait. Az erő lekérdezésekor add
//vissza a Bosszuallo szupererejét. Egy Bosszuallo egy Bosszuallo szuperhőst akkor tud
//legyőzni, ha annak van gyengesége, és ereje kisebb, mint az övé. Batman-t csak akkor
//tudja legyőzni, ha ereje kétszer nagyobb.