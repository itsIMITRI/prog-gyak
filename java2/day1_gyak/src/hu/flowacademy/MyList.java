package hu.flowacademy;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
        try {
            tomb[ind] = t;
            return tomb[ind];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Nincs ilyen elem!";
        }
    }



    public String toString(){
        String str = "";
        for (int i = 0; i < tomb.length; i++){
            str+=tomb[i] + " ";
        }
        return str;
    }
 //Készítsünk egy filter függvényt a lista implementációnkba, amely egy Test funkcionális interface paramétert vár,
 // és végigfut a kollekción, minden elemre meghívja a test függvényt, és amire igazzal tér vissza, azt egy listába teszi,
 // majd azt adja vissza!

    public MyList filter(Predicate<T> t){
        MyList<T> newList = new MyList<>(1);
        for(int i = 0; i < tomb.length; i++){
            if(t.test((T) tomb[i])){
                newList.add((T) tomb[i]);
            }
        }
        return newList;
    }

    public void forEach(Consumer<T> t){
        for(int i = 0; i < tomb.length; i++){
            t.accept((T) tomb[i]);
        }
    }

    //Készítsünk egy change függvényt a lista implementációnkba, amely egy Function interface paramétert vár,
    // aminek a paramétere és visszatérési értéke is megegyezik az osztály generikus paraméterével!
    // A függvény adjon vissza egy új listát, mely a régi lista elemeit tartalmazza a függvény végrehajtása után!

    public MyList<T> change(Function<T, T> t){
        MyList<T> newList = new MyList<>(1);
        for(int i = 0 ; i < tomb.length; i++){
            newList.add(t.apply((T) tomb[i]));
        }
        return newList;
    }

    //Készítsünk egy map függvényt a lista implementációnkba, amely egy Function interface paramétert vár.
    // A Function paramétere megegyező típus a lista generikusával, visszatérési értéke generikus,
    // de nem feltétlen ugyanaz, mint a listáé (generikus függvény!) Adjon vissza egy új kollekciót,
    // mely a régi lista elemeit tartalmazza a függvény végrehajtása után!

    public <E> MyList<E> map(Function<T,E> t){
        MyList<E> newList = new MyList<E>(1);
        for(int i = 0; i < tomb.length; i++){
            newList.add(t.apply ((T) tomb[i]));
        }
        return newList;
    }
}
