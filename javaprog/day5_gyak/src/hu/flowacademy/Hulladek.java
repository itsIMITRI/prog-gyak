package hu.flowacademy;

public abstract class Hulladek {

    protected final static String HULLADEK_FEM = "fem";
    protected final static String HULLADEK_UVEG = "uveg";
    protected String alapanyag;
    protected String leiras;
    protected int tomeg;


    public Hulladek(String alapanyag) {
        this.alapanyag = alapanyag;
        this.leiras = " ";
        this.tomeg = 1;
    }

    public void megsemmisit(){
        System.out.println( "Alapanyag: " + alapanyag + " tömeg: " + tomeg);
    }

    @Override
    public String toString() {
        return "Hulladek{" +
                "alapanyag='" + alapanyag + '\'' +
                ", leiras='" + leiras + '\'' +
                ", tomeg=" + tomeg +
                '}';
    }
}
