
import java.util.Scanner;

interface USB {
    void work();
    void stop();
}

class Mouse implements USB {
    public void work() {
        System.out.println("我点点点");
    }
    public void stop() {
        System.out.println("我不能点了");
    }
}

class UPan implements USB {
    public void work() {
        System.out.println("我存存存");
    }
    public void stop() {
        System.out.println("我走了");
    }
}

public class Main {
    public static void main(String[] args) {
        USB usb1;
        usb1=new Mouse();
        usb1.work();
        usb1.stop();
        USB[] usbs;
        usbs=new USB[2];
        usbs[0]=new UPan();
        usbs[1]=new Mouse();
        for(int i=0;i<2;i++) {
            usbs[i].work();
            usbs[i].stop();
        }
    }
}



