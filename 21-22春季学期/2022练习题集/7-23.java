
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person person[] = new Person[2];
        person[0] = new Person();
        person[1] = new Person(in.next());
        System.out.println(person[0].toString());
        System.out.println(person[1].toString());
    }
}

class Person {
    private String name;
    Person() {
        this.name = "none";
    }
    Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "name:"+name;
    }
}