package hu.flowacademy.butorgyar;

import java.util.Arrays;

public class Butor {

    int lapokSzama;
    Butorlap[] butorlapok;

    public Butor(){
        this.lapokSzama = 0;
        this.butorlapok = new Butorlap[100];
    }

    public void lapHozzaad(Butorlap lap){
        butorlapok[lapokSzama]  = lap;
        lapokSzama++;
    }

    public double arSzamol(){
        int res = 0;
        for(int i =0; i < lapokSzama;i++){
            res += butorlapok[i].arSzamol();
        } return res;
    }

    public String toString() {
        return "butorlapokSzama = " + lapokSzama + " Ár összesen: "+ arSzamol() ;
    }
}
