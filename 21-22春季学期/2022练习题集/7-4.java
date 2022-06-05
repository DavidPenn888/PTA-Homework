import java.util.Scanner;
public class Main {
    private static Scanner in;
    public static void main(String[] args){
        in = new Scanner(System.in);
        int num=in.nextInt();
        if(num>=1 && num<=10) {
            int a[]=new int[11];
            int sum=0,k=0;
            for(int i=0;i<num;i++) {
                a[i]=in.nextInt();
                sum+=a[i];
            }
            double avg=(double)sum/(double)num;
            System.out.printf("%.2f\n",avg);
            for(int i=0;i<num;i++) {
                if(a[i]>avg) {
                    System.out.printf("%d ",a[i]);
                    k++;
                }
            }
        }
        else
            System.out.println("Invalid.");
    }
}


