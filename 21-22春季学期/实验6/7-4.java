
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] strs = str.toCharArray();
        int a = 0 ,b = 0 ,c = 0 ,d = 0 ;
        for(int i=0 ;i<strs.length ;i++) {
            if(strs[i]>='A' && strs[i]<='Z' || strs[i]>='a' && strs[i]<='z') {
                a++;
            }
            else if(strs[i]>='0' && strs[i]<='9') {
                b++;
            }
            else if(strs[i]==' ') {
                c++;
            }
            else {
                d++;
            }
        }
        System.out.println("字母个数："+a+"\n" +"数字个数："+b+"\n" +"空格个数："+c+"\n" +"其他字符个数："+d);
    }
}
