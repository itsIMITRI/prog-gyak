package hu.flowacademy;

public class Stringer {
   private String szoveg;

    public Stringer(String szoveg){
        this.szoveg=szoveg;
    }

    public String csere(char betu) {
        return szoveg.replace(betu, '?');
    }


    public String csere2 (char betu){
      return szoveg.replaceAll("[^" + betu + "]", "?");
    }

    public String csere3 (){
        return szoveg.replaceAll("[^A-Za-z]", "*").replaceAll("[A-Za-z]", "?");
    }
}
