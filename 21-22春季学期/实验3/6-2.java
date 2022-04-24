import java.util.Scanner;
class Student {
    int id;
    String name;
    int age;
    public Student(int id,     String name,     int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /* 请在这里填写答案 */
    public boolean equals(Object s2) {
        Student obj=(Student) s2;
        if(this.id==obj.id)
            return true;
        else
            return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(sc.nextInt(),sc.next(),sc.nextInt());
        Student s2 = new Student(sc.nextInt(),sc.next(),sc.nextInt());
        System.out.println(s1.equals(s2));
        sc.close();
    }
}
