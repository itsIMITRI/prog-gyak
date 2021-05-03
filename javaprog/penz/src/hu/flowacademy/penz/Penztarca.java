package hu.flowacademy.penz;

public class Penztarca {
    protected int money;
    protected Penz[] penzek;

    public Penztarca() {
        this.money = 0;
        this.penzek = new Penz[100];
    }

    public void penzBetesz(Penz penz) {
        for (int i = 0; i < penzek.length; i++) {
            if (penzek[i] == null) {
                penzek[i] = penz;
                break;
            }
        }
    }

    public String penzSzamol(int ertek) {
        int result = 0;
        for (int i = 0; i < penzek.length; i++) {
            if (penzek[i] != null) {
                if(penzek[i].ertek == ertek){
                    result ++;
                }
            }

        }
        return "Ennyi " + ertek + " Ft-os van: " + result;
    }

    public String penzSzamol(boolean isPapir){
        int result = 0;
        for (int i = 0; i < penzek.length; i++) {
            if (penzek[i] != null) {
                if(penzek[i].isPapir == isPapir){
                    result ++;
                }
            }

        }
        return "Ennyi papír pénz van: " +result;
    }
}

