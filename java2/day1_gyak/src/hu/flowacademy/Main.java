package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
    MyList<Integer> lista = new MyList<>(2);
    lista.add(12);
    lista.add(22);
    lista.add(24);
        MyList<String> lista2 = new MyList<>(5);
    lista2.add("alma");
    lista2.add("körte");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        System.out.println(lista2.get(0));
        System.out.println(lista2.get(1));
        lista.set(0, 10);
        System.out.println(lista.get(0));
        int a = (int) lista.get(0);
        System.out.println(a);
        lista.clear();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));

        System.out.println(lista);
        System.out.println(lista.filter((num) -> num % 2 == 0));

    }
}
