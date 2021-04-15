package hu.flowacademy;
//Készítsünk egy egyszerű programot, ami 2 egész számot vár parancssori argumentumként, és elosztja ezeket a számokat
//egymással! Ügyelj a hibakezelésre, mind a parse és az osztás során is, valamint ellenőrizd le, hogy van-e elég bemenet!
public class Main {

    public static void main(String[] args) {
	if(args.length==2){
	    try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            if(b == 0){
                throw new ArithmeticException("Divide by Zero");
            }
            double d = a / (double)b;
            System.out.println(d);
        }catch (NumberFormatException e){
            System.out.println("Nem számot adott meg");
        }catch (ArithmeticException e){
            System.out.println("Nullával való osztás");
        }
    }else{
        System.out.println("Nincs elég bemenet");
        System.exit(0);
    }



    }
}
