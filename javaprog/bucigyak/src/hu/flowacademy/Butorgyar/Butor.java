package hu.flowacademy.Butorgyar;

public class Butor {
    protected int lapSzam;
    protected Butorlap[] lapok;

        public Butor(){
            this.lapSzam = 0;
            this.lapok = new Butorlap[100];
        }
    public void lapHozzaad(Butorlap lap){
        for(int i = 0; i < lapok.length; i++){
            if(lapok[i] == null){
                lapok[i] = new Butorlap(lap.hossz*100,lap.szelesseg*100,lap.isHatlap);
                lapSzam++;
                break;
            }
        }
    }
    public double arSzamol(){
            double result = 0;
            for(int i = 0; i < lapok.length; i++) {
                if (lapok[i] != null) {
                    result += lapok[i].arSzamol();

                }
            }
            return result;
    }

    public String toString(){
            return "Butor - lapok: " + lapSzam + " ár: " + arSzamol() + "Ft" ;
    }

}
