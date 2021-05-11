package hu.flowacademy;

public class MyList<T> {
    private int index;
    protected Object[] tomb;

    public MyList(int size) {
        tomb = new Object[size];
        this.index = 0;
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
