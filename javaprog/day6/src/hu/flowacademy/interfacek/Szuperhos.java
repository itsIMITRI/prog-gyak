package hu.flowacademy.interfacek;

public interface Szuperhos {

    //írj egy Szuperhos interfészt, ami egy legyoziE metódust tartalmaz. A metódus paramétere egy Szuperhos, és egy logikai értékkel tér vissza. Legyen egy mekkoraAzEreje
    //metódusa is, ami nem kér paramétert, és a Szuperhos erejét fogja visszaadni.

    boolean legyoziE(Szuperhos s);
    double mekkoraAzEreje();
}
