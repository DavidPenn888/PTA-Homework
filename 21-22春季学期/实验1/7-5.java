import java.util.Scanner;
public class Main {
    private static Scanner in;
    public static void main(String[] args){
        int sum=0;
        in = new Scanner(System.in);
        int a[]=new int[20];
        int k=in.nextInt();
        for(int i=0;i<k;i++) {
            a[i]=in.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
    }
}

