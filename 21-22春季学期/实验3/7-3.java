
import java.util.Scanner;

interface ICompute {
    int computer(int n, int m);
}

public class Main {
    public static void main(String[] args) {
        int n,m;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();m=in.nextInt();
        Add a1=new Add();
        Sub s1=new Sub();
        System.out.println(a1.computer(n,m));
        System.out.println(s1.computer(n,m));

    }
}

class Add implements ICompute {
    public int computer(int n, int m) {
        return n + m;
    }
}

class Sub implements ICompute {
    public int computer(int n, int m) {
        return n-m;
    }
}


