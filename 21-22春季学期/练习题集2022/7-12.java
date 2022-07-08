import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] grade = new int[5];
        for(int i=0; i<grade.length; i++){
            grade[i] = in.nextInt();
        }

        RR rr = new RT(grade);
        double dd = rr.mark();
        System.out.printf("%.2f",dd);
    }
}
interface RR{
    double mark();
}

class RT implements RR{
    int[] grade;
    public RT(int[] grade){
        this.grade = grade;
    }

    @Override
    public double mark() {
        return (grade[1]+grade[2]+grade[3])/3.0;
    }
}