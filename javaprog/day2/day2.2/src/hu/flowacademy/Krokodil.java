package hu.flowacademy;

public class Krokodil {
    int kor;
    int fogSzam;
    boolean alszikE;
    int hp;

    public Krokodil(int kor, int fogSzam, boolean alszikE, int hp){
        this.kor = kor;
        this.fogSzam = fogSzam;
        this.alszikE = alszikE;
        this.hp = hp;
    }


    public void alszik(boolean alszikE){
        if(this.alszikE){
            this.hp = 100;
        }
    }

}
