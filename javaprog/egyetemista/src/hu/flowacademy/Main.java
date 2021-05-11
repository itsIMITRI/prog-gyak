package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
    Egyetemista feri = new Egyetemista(123);
    Egyetemista jozsi = new Egyetemista(222);
    KozepkoriEgyetemista csigusz = new KozepkoriEgyetemista(233);

        feri.tanul(22);
        feri.kocsmazik(10);
        csigusz.tanul(40);
        jozsi.kocsmazik(20);
        System.out.println(feri);
        System.out.println(jozsi);
        System.out.println(csigusz);
    }
}
