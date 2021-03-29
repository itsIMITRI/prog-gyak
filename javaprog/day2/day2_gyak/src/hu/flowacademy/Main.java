package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("nincs elég bemenet");
            System.exit(0);
        }
        int smallest = elso(args);
        System.out.println(smallest);
        //int biggest = masodik(args);
        // System.out.println(biggest);
        //int sum = harmadik(args);
        // System.out.println(sum);
        //double avg = negyedik(args);
        // System.out.println(avg);
        // String otoske = otodik(args);
        // System.out.println(otoske);
        // int hatos = hatodik(args);
        //  System.out.println(hatos);
        // int hetes = hetedik(args);
        // System.out.println(hetes);
        // int nyolcas = nyolcadik(args);
        // System.out.println(nyolcas);
        // String kilences = kilencedik(args);
        //  System.out.println(kilences);
        tizedik(args);

    }


    public static int elso(String[] args) {

        int min = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) < min) {
                min = Integer.parseInt(args[i]);
            }
        }
        return min;
    }

    public static int masodik(String[] args) {

        int max = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);
            }
        }
        return max;
    }

    public static int harmadik(String[] args){
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        return sum;
    }

    public static double negyedik(String[] args){
       int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        return sum / (double)args.length;
    }

   /* public static String otodik2(String[] args){
        int posMin =  Integer.MAX_VALUE;
        int negMax = Integer.MIN_VALUE;

        for(int i = 0; i < args.length; i++){
            BELÜL VÉGIG VIZSGÁLNI A FENTIEKKEL AZ ELEMEKET ÉS ELMENTENI ...
        }
    }*/


    public static String otodik(String[] args){
        int minCount = 0;
        int posCount = 0;
        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i])>0){
                posCount++;
            }else{
                minCount++;
            }
        }
        int [] minus = new int[minCount];
        int [] positiv = new int[posCount];
        int j = 0;
        int k = 0;
        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i])<0){
                minus[j]=Integer.parseInt(args[i]);
                j++;
            }else{
                positiv[k]=Integer.parseInt(args[i]);
                k++;
            }
        }
    int min = positiv[0];
    int max = minus[0];
        for (int i = 0; i < positiv.length; i++) {
            if (positiv[i] < min) {
                min = positiv[i];
            }
        }
        for (int i = 0; i < minus.length; i++) {
            if (minus[i] > max) {
                max = minus[i];
            }
        }
    String result = min + " " + max;

        return result;
    }

    public static int hatodik(String[] args){
        int posCounter = 0;
        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i])>0){
                posCounter++;
            }
        }
        return posCounter;
    }

    public static int hetedik(String[] args){
        int negCounter = 0;
        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i])<0){
               negCounter++;
            }
        }
        return negCounter;
    }

    public static int nyolcadik(String[] args){
        int zeroCounter = 0;
        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i])==0){
                zeroCounter++;
            }
        }
        return zeroCounter;
    }

    public static String kilencedik(String[] args){
        int sumParos = 0;
        int sumParatlan = 0;
        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i]) % 2 == 0 ){
                sumParos += Integer.parseInt(args[i]);
            }else{
                sumParatlan += Integer.parseInt(args[i]);
            }
        }
        if(sumParos > sumParatlan){
            return "A paros számok összege a nagyobb!";
        }else if(sumParatlan > sumParos){
            return "A paratlan számok összege a nagyobb!";
        }else{
            return "Egyforma a két összeg!";
        }
    }

    public static void tizedik (String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a);
        System.out.println(b);
       for(int i = a; i <= b; i++){
            System.out.print(i);
            System.out.print(" ");
        }
    }


}