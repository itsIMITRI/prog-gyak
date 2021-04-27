package hu.flowacademy;

public class NotFoundException extends Exception{

    public NotFoundException(String msg){
        super(msg);
    }


    @Override
    public String toString() {
        return super.getMessage();
    }
}
