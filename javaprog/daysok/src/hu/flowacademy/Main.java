package hu.flowacademy;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
 //Írj számkitalálós játékot! A gép „gondoljon” egy véletlen számra 1 és 100 között,
    // majd a konzolról beolvasott tippekre reagáljon „kisebb”, „nagyobb” vagy „eltaláltad” konzol üzenettel (nyilván mindig a megfelelővel!).
    // A sikeres találat után a program megáll, de újbóli indításkor (valószínűleg) másik véletlen számra „gondol”.


    public static void main(String[] args) {

        //kitalal();
        //szamol();
}

public static void kitalal(){
    Scanner in = new Scanner(System.in);
    int random = (int) Math.floor(Math.random()*100);
    int a = in.nextInt();
    while(a != random) {

        if(a < random){
            System.out.println("Nagyobb számra gondoltam");
        }
        if(a > random){
            System.out.println("Kisebb számra gondoltam");
        }
        a = in.nextInt();
    }
    System.out.println("Kitaláltad a számot. Amire gondoltam: " + random);
    in.close();
}
//Hányszor szerepel a Romeo és Júlia eredeti szövegében a „love” szó?
// Írj olyan programot, amely tetszőleges szóra hatékonyan megállapítja hogy hányszor szerepel a szövegben!
// http://www.textfiles.com/etext/AUTHORS/SHAKESPEARE/shakespeare-romeo-48.txt

    public static void szamol(){
        int counter = 0;
        try {
            File myObj = new File("/home/imi/javaprog/prog-gyak/javaprog/daysok/src/hu/flowacademy/romeo.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splited = data.split("[\\W]");
                for(int i = 0; i < splited.length; i++){
                    if(splited[i].equalsIgnoreCase("love")){
                        counter++;
                    }
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(counter);
    }

}
