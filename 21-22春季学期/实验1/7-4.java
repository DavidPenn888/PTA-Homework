import java.util.Scanner;
public class Main {
    private static Scanner in;
    public static void main(String[] args){
        int a=0,b=0,c=0,i=0,sum=0,num=0;
        double avg=0;
        in = new Scanner(System.in);
        for(i=0;i<10000;i++) {
            num=in.nextInt();
            if(num==0 & a==0 & b==0)
                return;
            else if(num==0)
                break;
            if(num>0) {
                sum+=num;
                a++;c++;
            }
            else if(num<0) {
                sum+=num;
                b++;c++;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);
        if(c!=0) {
            avg=(double)sum/(double)c;
            System.out.println(avg);
        }
        else
            System.out.println("0.0");
    }
}

