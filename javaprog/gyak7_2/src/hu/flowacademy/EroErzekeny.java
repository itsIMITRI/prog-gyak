package hu.flowacademy;
///Írj egy EroErzekeny interfészt, ami egy legyoziE metódust tartalmaz. A metódus paramétere egy EroErzekeny objektum, és egy logikai értékkel tér vissza. Legyen egy
////mekkoraAzEreje metódusa is, ami nem kér paramétert, és az EroErzekeny erejét fogja
////visszaadni.
public interface EroErzekeny {

    boolean legyoziE(EroErzekeny e);
    double mekkoraAzEreje();
}
