import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        String[] persons1=new String[n1];
        for(int i=0;i<n1;i++) {
            PersonOverride PO1=new PersonOverride();
            persons1[i]=PO1.toString();
        }
        int n2=in.nextInt();
        String[] persons2=new String[n2];

        int k=0;
        for(int i=0;i<n2;i++) {
            PersonOverride PO2=new PersonOverride(in.next(),in.nextInt(),in.nextBoolean());
            if(PO2.equals(k,persons2)) {
                persons2[k]=PO2.toString();
                k++;
            }
        }

        for(int i=0;i<n1;i++) {
            System.out.println(persons1[i]);
        }

        for(int i=0;i<k;i++) {
            System.out.println(persons2[i]);
        }
        System.out.println(k);
        System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
    }

}

class PersonOverride {
    private String name;
    private int age;
    private boolean gender;

    public PersonOverride(){
        this.name="default";
        this.age=1;
        this.gender=true;
    }

    public PersonOverride(String name,int age,boolean gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String toString() {
        String Full=name+"-"+age+"-"+gender;
        return Full;
    }

    public boolean equals(int k,String persons2[]) {
        String ex=name+"-"+age+"-"+gender;
        for(int i=0;i<k;i++) {
            if(ex.equals(persons2[i])) {
                return false;
            }

        }
        return true;
    }
}