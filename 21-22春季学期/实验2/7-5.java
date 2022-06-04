import java.util.Scanner;


class Person
{
    char name;int age;boolean gender;int id;int num;int k=0;

    public Person()
    {
        System.out.println("This is constructor");
        System.out.println("null,0,false,0");
        System.out.println("Person [name=null, age=0, gender=false, id=0]");
    }

    public Person(int n)
    {
        num=n;
    }

    public String toString(char n,int a,boolean g)
    {
        String str="Person [name="+n+", age="+a+", gender="+g+", id="+0+"]";
        return str;
    }
}


public class Main
{
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        char name[]=new char[num];
        int age[]=new int[num];
        boolean gender[]=new boolean[num];
        int id[]=new int[num];
        Person P=new Person(num);
        for(int i=0;i<num;i++)
        {
            name[i]=in.next().charAt(0);
            age[i]=in.nextInt();
            gender[i]=in.nextBoolean();
        }
        for(int i=num-1;i>=0;i--)
        {
            System.out.println(P.toString(name[i],age[i],gender[i]));
        }
        Person Per=new Person();
    }
}

