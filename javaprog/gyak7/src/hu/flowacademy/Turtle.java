package hu.flowacademy;
//1. Turtle osztály, mely a teknőcöt valósítja meg. Legyen két egész számot tároló adattagja a
//pozíciójára, továbbá egy logikai adattag, mely a toll állapotát reprezentálja, valamint a pálya
//méreteit is tárold le (két irányban)!
public class Turtle {
    protected int pos_x;
    protected int pos_y;
    protected boolean usingPen;
    protected int xSize;
    protected int ySize;

    public Turtle(int xSize, int ySize) {
        this.pos_x = 0;
        this.pos_y = 0;
        this.usingPen = false;
        this.xSize = xSize;
        this.ySize = ySize;
    }
//Legyen a teknőcnek egy move függvénye, mely egy Stringet vár paraméterként, ez lesz az
//irány, amerre lépni kell, és térjen vissza logikai értékkel annak megfelelően, hogy az adott
//irány nem mutat-e túl a pálya határain! A lépést végezze is el, azaz a koordinátáit módosítsa
//megfelelően! (Irányok: LE, FEL, JOBBRA, BALRA)

    public boolean move(String movement) {

        try {

            if (movement.equals("JOBBRA")) {
                if ((pos_y + 1) < ySize) {
                    pos_y += 1;
                    return true;
                } else {
                    throw new KileptemAPalyarolException("Kiléptél a pályáról!");

                }
            } else if (movement.equals("BALRA")) {
                if ((pos_y - 1) >= 0) {
                    pos_y -= 1;
                    return true;
                } else {
                    throw new KileptemAPalyarolException("Kiléptél a pályáról!");

                }
            } else if (movement.equals("LE")) {
                if ((pos_x + 1) < xSize) {
                    pos_x += 1;
                    return true;
                } else {
                    throw new KileptemAPalyarolException("Kiléptél a pályáról!");

                }
            } else if (movement.equals("FEL")) {
                if ((pos_x - 1) >= 0) {
                    pos_x -= 1;
                    return true;
                } else {
                    throw new KileptemAPalyarolException("Kiléptél a pályáról!");

                }
            }

        } catch (KileptemAPalyarolException e) {
            System.out.println(e);
        }
        return false;
    }

    //Legyen egy changePen függvénye, mely a toll állapotát változtatja a paraméterben
    //kapottnak megfelelően! Ez gyakorlatilag egy setter függvény :)

    public void changePen(String doPen){
        if(doPen.equals("TOLLAT FEL")){
            usingPen = false;
        }
        if(doPen.equals("TOLLAT LE")){
            usingPen = true;
        }

    }

    @Override
    public String toString() {
        return "A teknős pozíciója: " + "X: " + pos_x + ", Y: " + pos_y + ", A toll " + (usingPen ? " lent van" : " fent van");
    }
}
