package hu.flowacademy;

public class Main {

    public static void main(String[] args) {

        Hulladek p = new Palack("palack");
        System.out.println(p);
        SorosDoboz sd = new SorosDoboz("sor");
        System.out.println(sd);
        KartonDoboz kd = new KartonDoboz("karton");
        System.out.println(kd);

        Hulladek[] tomb = new Hulladek[3];
        tomb[0]=p;
        tomb[1]=sd;
        tomb[2]=kd;

        if(tomb[1] instanceof Ujrahasznosithato){
            ((Ujrahasznosithato) tomb[1]).ujrahasznosit();
        }
        megsemmisit(tomb);
    }

    public static void megsemmisit(Hulladek[] tomb){
        for(int i = 0; i < tomb.length; i++){
            tomb[i].megsemmisit();
        }
    }

}
