package hu.flowacademy;

public class Palack extends Hulladek implements Ujrahasznosithato{

public Palack (String leiras){
        super(HULLADEK_UVEG);
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
