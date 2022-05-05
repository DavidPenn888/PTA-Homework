
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String oldstr = in.nextLine();
        String newstr = in.nextLine();
        String[] changestr = str.split(" ");
        for(int i=0 ;i<changestr.length ;i++ ) {
            if(changestr[i].equals(oldstr)) {
                changestr[i] = newstr;
            }
        }
        String laststr = new String();
        for(int i=0 ;i<changestr.length ;i++ ) {
            laststr += changestr[i] + " ";
        }
        System.out.println(laststr.trim());
    }
}
