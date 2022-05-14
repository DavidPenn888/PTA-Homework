import java.util.Scanner;

/*这里放置你的答案，即MyThread类的代码*/
class MyThread extends Thread{
    int i;
    public MyThread(int i){
        this.i=i;
    }
    public void run () {
        for(int r=0;r<i;r++) {
            System.out.println(r);
        }
        System.out.println(Thread.currentThread().getName()+" "+isAlive());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread t1 = new MyThread(Integer.parseInt(sc.next()));
        t1.start();
    }
}
