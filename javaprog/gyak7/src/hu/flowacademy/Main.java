package hu.flowacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Map terkep = new Map(10,10);
//	terkep.drawMap();
//	terkep.doCommand("TOLLAT LE");
//	terkep.doCommand("JOBBRA 2");
//	System.out.println();
//	terkep.drawMap();
//	terkep.doCommand("TOROL");
//	terkep.drawMap();
//Készíts egy Main osztályt, melyben a program belépési pontja lesz! Ebben példányosíts
//egy Scannert, továbbá egy Map példányt! Készíts egy while ciklust, mely addig fut, amíg a
//felhasználó nem írja be a "KILÉP" szöveget! A ciklusmagban hívd meg a map osztály
//doCommand függvényét a bemeneten kapott String-el, továbbá rajzoltasd ki a táblát a
//drawMap függvénnyel!

		terkep.drawMap();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		while(!s.equals("KILEP")){
			terkep.doCommand(s);
			terkep.drawMap();
			System.out.println();
			s = scan.nextLine();
		}

	}


}
