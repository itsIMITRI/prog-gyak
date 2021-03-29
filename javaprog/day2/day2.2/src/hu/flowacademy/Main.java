package hu.flowacademy;

import java.security.cert.CertificateEncodingException;

public class Main {

    public static void main(String[] args) {
        double eredmeny = 0;
        for(int i = 0; i < args.length; i++){
            eredmeny += Integer.parseInt(args[i]);
        }
        System.out.println(eredmeny / (double) args.length);

        ember mate = new ember("Máté",15, false);
        mate.koszon();
        ember kata = new ember("Kata",12, true);
        kata.koszon();
        //kata.nev="Feri";
        kata.koszon();
        //kata.setKor(15);
        System.out.println(mate);
        System.out.println(kata);

        Krokodil merges = new Krokodil(12, 123, true, 26);
    }
}
