
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double a[]=new double[n];
        for(int i=0;i<n;i++) {
            a[i]=in.nextDouble();
        }
        ArrayUtils arrayUtils=new ArrayUtils();
        System.out.println(arrayUtils.findMinMax(a).toString());
        System.out.println(ArrayUtils.PairResult.class);
    }
}

class ArrayUtils {
    static PairResult findMinMax(double[] s)
    {
        PairResult b=new PairResult();
        double min=s[0];
        double max=s[0];
        for(int i=0;i<s.length;i++) {
            if(s[i]>max) {
                max=s[i];
            }
            else if(s[i]<min) {
                min=s[i];
            }
        }
        b.setMax(max);
        b.setMin(min);
        return b;
    }

    static class PairResult {
        private double min;
        private double max;
        public void setMin(double min) {
            this.min = min;
        }
        public void setMax(double max) {
            this.max = max;
        }
        public String toString() {
            return "PairResult [" + "min=" + min + ", max=" + max + ']';
        }
    }
}


