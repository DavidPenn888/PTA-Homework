
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        while (in.hasNext()) {
            int n = in.nextInt();
            int begin = in.nextInt();
            int end = in.nextInt();
            for (int i = 0; i < n; i++) {
                str.append(i);
            }
            System.out.println(str.substring(begin, end));
        }
    }
}


