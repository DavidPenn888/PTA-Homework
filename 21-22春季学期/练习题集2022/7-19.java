import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String parson = new String();
        String parsons[] = new String[parson.split(" ").length];
        ArrayList<String> name = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        parson = in.nextLine();
        parsons = parson.split(" ");
        name.add(parsons[0]);
        int k;
        for(int i=0 ;i<parsons.length ;i++ ) {
            for(k=0 ;k<name.size() ;k++ ) {
                if(parsons[i].equals(name.get(k))) {
                    break;
                }
            }
            if(k==name.size()) {
                name.add(parsons[i]);
            }
        }
        int[] num = new int[name.size()];
        for(int i=0 ;i<num.length ;i++ )
            num[i]=0;
        for(int i=0 ;i<name.size() ;i++ ) {
            for(int e=0 ;e<parsons.length ;e++ ) {
                if(name.get(i).equals(parsons[e])) {
                    num[i]++;
                }
            }
        }
        int max = num[0];
        k=0;
        for(int i=1 ;i<num.length ;i++ ) {
            if(num[i]>max) {
                k=i;
                max = num[i];
            }
        }
        ArrayList<String> all = new ArrayList<>();
        for(int i=0 ;i<num.length ;i++ ) {
            if(num[i]==max) {
                all.add(name.get(i));
            }
        }
        for(int i=0 ;i<all.size() ;i++ ) {
            if(i==all.size()-1)
                System.out.println(all.get(i));
            else
                System.out.println(all.get(i)+" ");
        }
    }
}