
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long seed = in.nextLong();
        int n = in.nextInt();
        Random r = new Random(seed);
        int num = 0;
        for(int i=0 ;i<n ;i++ ) {
            double x = r.nextDouble()*2-1;
            double y = r.nextDouble()*2-1;
            if(x*x + y*y <=1 ) {
                num++;
            }
        }
        System.out.println(4.0*num/n);
    }
}
