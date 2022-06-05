
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student s1 = new Student(in.next(), in.nextInt(), in.next());
        System.out.println(s1.toString());
    }
}

class Student {
    private String name,sex;
    private int age;
    Student(String name, int age, String sex) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ']';
    }
}