package hu.flowacademy;

public class SorosDoboz extends Hulladek implements Ujrahasznosithato{



    public SorosDoboz (String leiras){
        super(HULLADEK_FEM);
        this.leiras=leiras;
    }


    public void ujrahasznosit() {
        System.out.println(alapanyag);
    }

    @Override
    public void megsemmisit() {
        super.megsemmisit();
        ujrahasznosit();
    }
}
