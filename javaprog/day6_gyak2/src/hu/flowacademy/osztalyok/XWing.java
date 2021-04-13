package hu.flowacademy.osztalyok;

import hu.flowacademy.interfacek.Hiperhajtomu;

public class XWing extends LazadoGep implements Hiperhajtomu {

        public XWing(){
            super(150,true);
        }

    @Override
    public boolean elkapjaAVonosugar() {
        return meghibasodhatE && sebesseg<10000;
    }

    @Override
    public void hiperUgras() {
        super.sebesseg+=Math.random()*100;
    }

    public String toSting(){
        return "Az X-Wing sebessége: " + sebesseg + (meghibasodhatE? " és meghibásodhat." : " és nem hibásodhat meg.");
    }
}
