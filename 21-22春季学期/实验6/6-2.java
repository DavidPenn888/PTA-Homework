import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int HUMANNUM=10;
        String persons[]=new String[HUMANNUM];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<persons.length;i++)
            persons[i]=in.nextLine();
        int result=numofHan(persons);
        System.out.println(result);

    }

    /*在此处给出函数numofHan()*/
    public static int numofHan(String data[]) {
        int num=0;
        for(int i=0 ;i<data.length ;i++ ) {
            if(data[i].indexOf("汉",4)>0) {
                num++;
            }
        }
        return num;
    }
}
