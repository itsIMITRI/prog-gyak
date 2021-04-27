package hu.flowacademy;
// Írj egy AnakinSkywalker osztályt, ami a Jedi leszármazottja, és megvalósítja a Sith interfészt.
//– Az osztálynak egy default konstruktora legyen, ami beállítja Anakin tulajdonságait.
//Anakin ereje 150, és átállhat a sötét oldalra.
//– Ha Anakin elengedi a haragját, akkor ereje egy 0-10 közötti véletlenszerű lebegőpontos számmal nő.
//– Anakin akkor teremti meg az egyensúlyt az erőben, ha ereje nagyobb, mint 1000.
//– Az osztály legyen továbbá szöveges formára alakítható. Az adattagok értékein kívül
//írja ki azt is, hogy a Anakin Skywalkerről van szó.
public class AnakinSkywalker extends Jedi implements Sith {

    public AnakinSkywalker(double ero, boolean atallhatE) {
        super(150, true);
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        return (mekkoraAzEreje() > 1000);
    }

    @Override
    public void engeddElAHaragod() {
        double ero = getEro();
        setEro(ero + Math.random()*10);
    }

    @Override
    public String toString() {
        return "Anakin Skywalker ereje: " + mekkoraAzEreje() + (getAtallhatE() ? " és átállhat a sötét oldalra" : " és nem állhat át a sötét oldalra.") ;
    }
}
