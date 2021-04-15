package hu.flowacademy;

import java.util.*;


public class Main {

    public static void main(String[] args) {
//        HashSet<Integer> hash = new HashSet<>();
//        Scanner in = new Scanner(System.in);
//
//        try{
//
//            while (hash.size() < 5) {
//                int szam = in.nextInt();
//                hash.add(szam);
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Please give a number.");
//        }
//        System.out.println(hash);
//        HashMap<String, Integer> nevId = new HashMap<>();
//        Scanner in2 = new Scanner(System.in);
//
//        try{
//
//            while (nevId.size() < 3) {
//                String sor = in2.nextLine();
//                String[] temp = sor.split(" ");
//                nevId.put(temp[0], Integer.parseInt(temp[1]));
//            }
//        }catch (Exception e){
//            System.out.println("xd");
//        }
//        System.out.println(nevId);
//
//        System.out.println("Adj meg egy ID-t");
//        Scanner in3 = new Scanner(System.in);
//        int number = 0;
//        try {
//            number = in3.nextInt();
//        }catch (InputMismatchException e){
//            System.out.println("nem jó");
//        }
//            if(nevId.containsValue(number)){
//                System.out.println("Benne van");
//            }else{
//                System.out.println("nincs benne");
//            }
        //Készíts egy programot, amely megszámolja a parancssori argumentumokra, hogy
        //azokban
        //hány különböző betű van! A megvalósításhoz használj halmazt (Set<Character>,
        //segít a
        //String osztály toCharArray() metódusa is)!
        Set<String> csar = new HashSet<>();

        for (int i = 0; i < args.length; i++) {
            String[] temp = args[i].split("");
            csar.addAll(Arrays.asList(temp));
        }System.out.println(csar.size());


        }

    }
    //- Készíts egy programot, mely példányosít egy HashMap-et, melyben Integer
    //kulcs és String érték lehetséges! Olvass be a konzolról Stringeket, mely
    //formátuma a következő: Józsi 11 - Az első adat egy név, a második egy ID.
    //Helyezd el a HashMap-ben a sorok adatait!

