package hu.flowacademy;


public class Main {

    public static void main(String[] args) {

      Macska kazmer = new Macska("Kázmér", 12.5, true);
      Macska cirmi = new Macska("Cirmi", 11.2, false);

        //System.out.println(kazmer);
        //System.out.println(kazmer.eszik(1) ? "Sikeres etetés" : "Sikertelen etetés");
        //System.out.println(kazmer);
        // kazmer.futkos();
        // System.out.println(kazmer);
        // kazmer.setWeight(20);
        // System.out.println(kazmer.getWeight());
        //  System.out.println(cirmi);

       Computer gep1 = new Computer(1300, false);
       Computer gep2 = new Computer(950, false);

        //System.out.println(gep1);
        //System.out.println(gep2);
        //gep1.kapcsol();
        //System.out.println(gep1);
        //System.out.println(gep1.programMasol(800) ? "sikeres másolás" : "sikertelen másolás");
        //System.out.println(gep1);
        //System.out.println(gep1.programMasol(600) ? "sikeres másolás" : "sikertelen másolás");
        //System.out.println(gep1);

        Stringer szoveg = new Stringer("uri2sTen mEnnye4ma");
        System.out.println(szoveg.csere('e'));
        System.out.println(szoveg.csere2('e'));
        System.out.println(szoveg.csere3());

        //Tomb array = new Tomb({{1,2,3},{1,2,3}});


    }
}
