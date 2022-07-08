import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int y=in.nextInt();
        int a=0;
        if(y % 4 == 0 && y % 100 != 0 || y %400 == 0) {
            switch(m) {
                case 1:a=31;break;
                case 2:a=29;break;
                case 3:a=31;break;
                case 4:a=30;break;
                case 5:a=31;break;
                case 6:a=30;break;
                case 7:a=31;break;
                case 8:a=31;break;
                case 9:a=30;break;
                case 10:a=31;break;
                case 11:a=30;break;
                case 12:a=31;break;
            }
        }
        else{
            switch(m) {
                case 1:a=31;break;
                case 2:a=28;break;
                case 3:a=31;break;
                case 4:a=30;break;
                case 5:a=31;break;
                case 6:a=30;break;
                case 7:a=31;break;
                case 8:a=31;break;
                case 9:a=30;break;
                case 10:a=31;break;
                case 11:a=30;break;
                case 12:a=31;break;
            }
        }
        System.out.println(a);
    }
}