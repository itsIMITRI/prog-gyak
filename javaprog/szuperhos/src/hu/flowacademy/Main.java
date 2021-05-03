package hu.flowacademy;

public class Main {
    static Szuperhos[] hosok = new Szuperhos[10];

    public static void main(String[] args) {

        szereplok();
        szuperhosok();

        System.out.println(hosok[7].legyoziE(hosok[8]));
    }

    public static void szereplok() {
        for (int i = 0; i < hosok.length; i++) {
            if (i < 5) {
                hosok[i] = new Batman();
                for (int j = 0; j < Math.floor(Math.random() * 5 + 3); j++) {
                    if (hosok[i] instanceof Batman) {
                        ((Batman) hosok[i]).kutyutKeszit();
                    }
                }
            }
            else{
            hosok[i] = new Vasember();
            for (int k = 0; k < Math.floor(Math.random() * 12 + 2); k++) {
                if (hosok[i] instanceof Vasember) {
                    ((Vasember) hosok[i]).kutyutKeszit();
                }
            }

        }
        }

    }
    public static void szuperhosok(){
        for(int i = 0; i < hosok.length; i++){
            System.out.println(i +". hős: " + hosok[i]);
        }
    }
}
