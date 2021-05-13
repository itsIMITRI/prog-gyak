package hu.flowacademy;

import java.nio.BufferUnderflowException;
import java.util.concurrent.atomic.AtomicBoolean;

public class Stack<T> {
    private int index;
    private Object[] array;

    public Stack(int size){
        this.index = 0;
        array = new Object[size];
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
        T temp = (T) array[--index];
        array[index] = null;
        index--;
        return temp;
    }

    public Object peek(){
        return array[index];
    }

}
