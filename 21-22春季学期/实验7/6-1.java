import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /*covnertStringToList函数代码*/
    public static List<String> convertStringToList(String line) {
        List<String> a = new ArrayList<>();
        String s[]=line.split("\\s+");
        for(int i=0 ;i<s.length ;i++) {
            a.add(s[i]);
        }
        return a;
    }

    /*remove函数代码*/
    public static void remove(List<String> list, String str) {
        for(int i=0 ;i<list.size() ; ) {
            if(list.get(i).equals(str)) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            List<String> list = convertStringToList(sc.nextLine());
            System.out.println(list);
            String word = sc.nextLine();
            remove(list,word);
            System.out.println(list);
        }
        sc.close();
    }
}
