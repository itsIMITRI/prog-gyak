package hu.flowacademy;

import hu.flowacademy.osztalyok.Batman;
import hu.flowacademy.osztalyok.Vasember;

public class Kepregeny {
   private static Batman[] b = new Batman[5];
   private static Vasember [] v = new Vasember[5];

   public static void main(String[] args){
    szereplok();
    szuperhosok();

    }
public static void szereplok(){


        for(int i = 0; i < 5; i++){
            b[i]= new Batman();
            v[i]= new Vasember();
        }
        for(int i = 0; i < 5; i++){
            int random = (int) (Math.floor(Math.random()*5)+3);
            int random2 = (int) (Math.floor(Math.random()*12)+2);

            for(int j = 0; j < random; j++){
                b[i].kutyutKeszit();
            }
            for(int k = 0; k < random2; k++){
                v[i].kutyutKeszit();
            }
        }
}

public static void szuperhosok(){
        for(int i = 0; i < 5; i++){
            System.out.println(b[i]);
            System.out.println(v[i]);
        }
}

}
//Írj egy Kepregeny nevű futtatható osztályt. Az osztály rendelkezzen egy szereplok statikus
//függvénnyel,visszatérése pedig void. A metódus feladata, hogy létrehozzon belőlük 5-5 Batman,
//vagy Vasember objektumpéldányokat, majd ezekre meghívja a kutyutKeszit metódust, Batmannél
//egy random(3-5 között), míg Vasembernél random(2-12 között). Tárold le őket egy tömbben.
//-Készíts továbbá egy szuperhosok statikus metódust, ami végigmegy a tömbben tárolt
//szuperhősökön, és kiírja őket. Hívd meg a main függvényben sorban a fenti két metódust.