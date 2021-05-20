package hu.flowacademy;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static class Person{
        String name;
        String email;
        int age;

        public Person(String name, String email, int age) {
            this.name = name;
            this.email = email;
            this.age = age;
        }
        public String toString(){
            return "Név:" + name + " email: " + email + " kor: " + age;
        }
    }

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Peti", "peti@gmail.com",29),
                new Person("Buci", "buci@freemail.com",29),
                new Person("Robi", "robi@gmail.com",30));

        persons.stream().filter(p -> p.email.endsWith("gmail.com")).map(p -> p.email).collect(Collectors.toSet()).forEach(System.out::println);
    }


}
