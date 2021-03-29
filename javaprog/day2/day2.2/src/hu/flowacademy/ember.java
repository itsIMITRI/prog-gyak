package hu.flowacademy;

public class ember {
        String nev;
         int kor;
         boolean szeretiACicat;

        public ember (String nev, int kor, boolean szeretiACicat){
            this.nev = nev;
            this.kor = kor;
            this.szeretiACicat = szeretiACicat;
        }

        public void koszon(){
            System.out.println("Szia, én " + nev + " vagyok.");
        }
        public void setKor(int kor){
            if(kor >= this.kor){
                this.kor=kor;
            }
        }

        public String toString(){
            return "Név: " + this.nev + " Kor: " + this.kor + (this.szeretiACicat ? "":" nem") + " szereti a cicát!";
        }
}

