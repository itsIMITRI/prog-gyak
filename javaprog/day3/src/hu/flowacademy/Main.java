package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
	Kutya bodri = new Kutya("Bodri",3,true,88, "kék");
    Kutya lili = new Kutya("Lili", 2, false, 99.2, "zöld");

        System.out.println(bodri.getNev());
        lili.setAge(5);
        System.out.println(lili.getAge());

        System.out.println(lili);


    }
}
