package hu.flowacademy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

    public static Map<String, Fegyorok> fegyorok = new TreeMap<>();
    public static Map<Integer, Rabok> rabok = new TreeMap<>();


    public static void main(String[] args) {
        try {
            File myObj = new File("src/hu/flowacademy/fegyorok.txt");

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Fegyorok f1 = new Fegyorok(data.split(" ")[0], Double.parseDouble(data.split(" ")[1].replaceAll("[,]", ".")));
                fegyorok.put(data.split(" ")[0], f1);

            }
            myReader.close();

            File myObj2 = new File("src/hu/flowacademy/rabok.txt");

            Scanner myReader2 = new Scanner(myObj2);
            while (myReader2.hasNextLine()) {
                String data2 = myReader2.nextLine();
                Rabok r1 = new Rabok(Integer.parseInt(data2.split(" ")[0]), Double.parseDouble(data2.split(" ")[1].replaceAll("[,]", ".")));
                rabok.put(Integer.parseInt(data2.split(" ")[0]), r1);
            }
            myReader2.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Ennyi rab van: " + rabok.size());
        System.out.println("Ennyi fegyőr van: " + fegyorok.size());
        System.out.println(fegyorok);
        System.out.println(rabok);
        try {
            System.out.println(getRab(17172).getBicepsSize());
        } catch (NotFoundException e) {
            System.out.println(e);
        }

        System.out.println((seta("R176") == 0 ? "senkit nem vihet sétálni" : seta("R176")));
        rabseta();
        System.out.println(rabok.);



    }

    public static void rabseta(){
        double max = 0;
        int counter = 0;
        for(Map.Entry<String, Fegyorok> fegyor : fegyorok.entrySet()){
            if(fegyor.getValue().getBicepsSize() > max){
                max = fegyor.getValue().getBicepsSize();
            }
        }
        System.out.println(max);
        for(Map.Entry<Integer, Rabok> rab : rabok.entrySet()){
            if(rab.getValue().getBicepsSize()>max){
                System.out.println(rab.getValue());
                counter++;
            }
        }
        if(counter == 0){
            System.out.println("minden rab kimehet");
        }

    }

    public static Rabok getRab(int id)throws NotFoundException{
       if( rabok.containsKey(id)){
           return rabok.get(id);
       }
      throw new NotFoundException("nem található rab ilyen azonosítóval");


    }



    public static int seta(String id) {
        int counter = 0;
        for (Map.Entry<Integer, Rabok> rab : rabok.entrySet()) {
            if (fegyorok.get(id).getBicepsSize() > rab.getValue().getBicepsSize()) {
                counter++;
            }
        }
        return counter;
    }

}
