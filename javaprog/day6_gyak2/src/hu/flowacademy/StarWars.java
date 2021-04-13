package hu.flowacademy;

import hu.flowacademy.interfacek.Hiperhajtomu;
import hu.flowacademy.interfacek.Urhajo;
import hu.flowacademy.osztalyok.LazadoGep;
import hu.flowacademy.osztalyok.MilleniumFalcon;
import hu.flowacademy.osztalyok.XWing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StarWars {
    static String [] tomb = new String[2];
    static Hiperhajtomu[] urhajok = new Hiperhajtomu[2];
    public static void main(String[] args){
        urhajok("src/hu/flowacademy/data.txt");
//        System.out.println(urhajok[0]);
//        System.out.println(urhajok[1]);
        hangar();

        if(urhajok[0] instanceof Urhajo){
            System.out.println(((XWing) urhajok[0]).legyorsuljaE((Urhajo) urhajok[1]));
        }

    }
public static void urhajok(String utvonal){
    try {
        File myObj = new File(utvonal);
        Scanner myReader = new Scanner(myObj);
        int i = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            tomb[i]=data;
            i++;
        }
        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    for(int i = 0; i < tomb.length; i++){
        String [] temp = tomb[i].split("@");
        System.out.println(temp[0] + " valami");
        System.out.println(temp[1]);

        if(temp[0].equals("XWing")){
            urhajok[i] = new XWing();
        }else if(temp[0].equals("MilleniumFalcon")){
            urhajok[i] = new MilleniumFalcon();
        }
        for(int j = 0; j < Integer.parseInt(temp[1]); j++){
            urhajok[i].hiperUgras();
        }


    }
}

public static void hangar(){
        for(int i = 0; i < urhajok.length; i++){
            System.out.println((i+1) + ". elem: " +urhajok[i]);
        }
}

}
