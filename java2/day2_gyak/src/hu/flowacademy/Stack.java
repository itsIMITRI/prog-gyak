package hu.flowacademy;


public class Stack<T> {
    private int index;
    private T[] array;

    public Stack(int size){
        this.index = 0;
        array = (T[]) new Object[size];
    }

    public void push(T e) {
        if (index > array.length - 1) {
            throw new StackOverflowError();
        } else {
            array[index] = e;
            index++;
        }
    }
    public Object pop(){
        if(index < 0){
            throw new RuntimeException("Stack Underflow");
        }
        T temp = array[--index];
        array[index] = null;
        index--;
        return temp;
    }

    public Object peek(){
        return array[index];
    }

}
