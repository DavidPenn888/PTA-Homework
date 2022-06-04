import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int date=in.nextInt();
        if(date % 4 == 0 && date % 100 != 0 || date %400 == 0)
            System.out.println("yes");
        else
            System.out.println("no");


    }

}

