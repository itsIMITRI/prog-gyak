package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
        System.out.println(armstrong(153));
        System.out.println(prim(191));
    }

    public static boolean armstrong(int num){
        String stringSzam = String.valueOf(num);
        int result = 0;
        for(int i = 0; i < stringSzam.length(); i++){
           int szam = Integer.parseInt(String.valueOf(stringSzam.charAt(i)));
               result += Math.pow(szam,stringSzam.length());
        }
        if(num == result){
            return true;
        }
        return false;
    }

    public static boolean prim(int sum){
        int counter = 0;
        for(int i = 1; i <= sum; i++){
            if(sum % i == 0){
                counter++;
            }
        }
        if(counter == 2){
            return true;
        }
        return false;
    }

}

