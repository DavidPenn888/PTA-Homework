import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1=0, n2=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int garde[] = new int[n];
        boolean error;
        for (int i = 0; i < n; i++) {
            do {
                error = false;
                try {
                    int a = in.nextInt();
                    if (a >= 0 && a <= 100) {
                        garde[i] = a;
                        if (a >= 60)
                            n1++;
                        else
                            n2++;
                    } else {
                        error = true;
                        throw new Exception(a);
                    }
                } catch (Exception a) {
                    a.prt();
                }
            }while (error);
        }
        System.out.println(n1);
        System.out.println(n2);
    }
}

class Exception extends Throwable {
    private int a;
    public Exception(int a) {
        super();
        this.a = a;
    }
    public void prt() {
        System.out.println(a+"invalid!");
    }
}