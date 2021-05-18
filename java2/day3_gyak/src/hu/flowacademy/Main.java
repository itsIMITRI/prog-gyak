package hu.flowacademy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	//Adott egy stringekkel feltöltött lista.
        List<String> lista = new ArrayList<>();
        lista.add("Cica");
        lista.add("Kutya");
        lista.add("Almapálinka");
        lista.add("Elefánt");
        lista.add("Zebra");
        lista.add("Egér");
        lista.add("Almafa");
        lista.add("Bölömbika");
        //Írassuk ki az elemeit streamek segítségével!
        lista.forEach(System.out::println);
        System.out.println("******");
        //Számoljuk meg, mennyi 5 betűnél hosszabb string van!
        int sum = (int) lista.stream().filter((str) -> str.length() > 5).count();
        System.out.println(sum);
        System.out.println("******");
        //Cseréljük ki a stringekben az “a” betűket “cica” szövegre!
        lista.stream().map((e) -> e.replaceAll("a","cica")).forEach(System.out::println);
        System.out.println("******");
        //Szűrjük ki az “alma” részszót tartalmazó szavakat a listából!
        lista.stream().filter((str) -> str.toLowerCase().contains("alma")).forEach(System.out::println);
    }
}
