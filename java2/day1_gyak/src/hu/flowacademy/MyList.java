package hu.flowacademy;

public class MyList<T> {
    private int index;
    protected Object[] tomb;

    public MyList(int size) {
        tomb = new Object[size];
        this.index = 0;
    }
//Remove(index): adja vissza a tömb adott indexen lévő elemét, és törölje ki a listából,
// ha létezik! Ha nem, dobjon kivételt!
//Clear(): törölje ki az összes elemet a tömbből, az indexet állítsa 0-ra!

    public void clear(){
            tomb = null;
            tomb = new Object[1];
        index = 0;
    }

    public Object remove(int ind){
        T removed = (T) tomb[ind];
        Object[] newTomb = new Object[index-1];
        for (int i = 0; i < tomb.length; i++){

        }
        return removed;
    }

    public void add(T e) {
        if (index > tomb.length - 1) {
            Object[] newTomb = new Object[tomb.length + 1];
            for (int i = 0; i < tomb.length; i++) {
                newTomb[i] = tomb[i];
            }
            newTomb[index++] = e;
            tomb = newTomb;
        } else {
            tomb[index++] = e;
        }
    }

    public Object get(int ind) {
       try{
           //System.out.println(tomb[ind]);
           return tomb[ind];
       }
       catch (ArrayIndexOutOfBoundsException e){
           return "Nincs ilyen elem";
       }

    }

    public Object set(int ind, T t) {
        try{
            tomb[ind] = t;
           return tomb[ind];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return "Nincs ilyen elem!";
        }
    }

}
