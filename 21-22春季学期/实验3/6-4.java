
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void work(){

    }
    void show() {
        System.out.print(name+" "+age+" ");
    }
}

/* 请在这里填写答案 */
class Teacher extends Person{
    String school;
    Teacher(String name,int age,String school){
        super(name,age);
        this.school=school;
    }
    void work() {
        System.out.println("教师的工作是教学。");
    }
    void show() {
        super.show();
        System.out.println(school);
    }
}

public class Main {

    public static void main(String[] args) {

        Teacher t = new Teacher("Li",40,"信工院");
        t.show();
        t.work();
    }
}
