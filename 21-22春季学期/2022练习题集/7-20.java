import java.util.Scanner;

class time implements Runnable {
    private int N;
    public time(int N) {
        this.N = N;
    }
    public void run() {
        for(int i=N ;i>=0 ;i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        time t1 = new time(N);
        Thread test = new Thread(t1);
        test.start();
    }
}