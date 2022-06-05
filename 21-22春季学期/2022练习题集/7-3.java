import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a*a+b*b==c*c)
            System.out.println(a*b/2.0);
        else if(a*a+c*c==b*b)
            System.out.println(a*c/2.0);
        else if(b*b+c*c==a*a)
            System.out.println(b*c/2.0);
        else
            System.out.println(0.0);

    }
}


