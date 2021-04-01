package hu.flowacademy;

import java.util.Arrays;

public class Tomb {
    int[][] tomb;

    public Tomb(int [][] tomb){
        this.tomb=tomb;
    }

    public String toString() {
        return Arrays.toString(tomb);
    }
}
