package hu.flowacademy;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        try{
            int szam = in.nextInt();

            while (szam != 777) {

                list.add(szam);
                szam = in.nextInt();
            }
        }catch (InputMismatchException e){
            System.out.println("Please give a number.");
        }



        kiiro(list);
        System.out.println(isContains(list, 5)? "The list contains the number" : "The list doesnt contains the number");
        //deleteEven(list);
        kiiro(list);
        System.out.println();
        System.out.println(isContains2(list));

    }
    public static void kiiro(ArrayList list){

        for(int i = 0; i < list.size(); i++){

            System.out.print(list.get(i) + (i==list.size()-1? "" : ", "));
        }


    }


    public static boolean isContains(ArrayList<Integer> list, int num){
        System.out.println();
        return list.contains(num);
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) == num){
//                System.out.println();
//                return true;
//            }
//        }
//        return false;
    }

    public static void deleteEven(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
    }
    //- Kérj be a felhasználótól 3 darab számot, ezeket helyezd el egy másik
    //listában! Vizsgáld meg, hogy a felhasználó által adott számok mind
    //szerepelnek-e az első listában! (Írd ki az eredményt konzolra, valamint
    //használd a beépített függvényeket!)
    public static boolean isContains2(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        try{

            while (list2.size() < 3) {
                int szam = in.nextInt();
                list2.add(szam);
            }
        }catch (InputMismatchException e){
            System.out.println("Please give a number.");
        }
    return list.containsAll(list2);
    }

}
