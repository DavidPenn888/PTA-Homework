
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Person> list = new ArrayList();
        int n = in.nextInt();
        for(int i=0; i<n; i++)
            list.add(new Person(in.next(), in.nextInt()));
        for(int i=0; i<n; i++)
            System.out.println(list.get(i).toString());
        String name = in.next();
        for(int i=0; i<n; i++) {
            if(list.get(i).getName().equals(name)) {
                System.out.println(list.get(i).toString());
                break;
            }
            if(i==n-1) {
                System.out.println("此人不存在");
            }
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [" + "name=" + name + ", age=" + age + ']';
    }
}