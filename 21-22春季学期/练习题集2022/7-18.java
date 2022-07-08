import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        for(;;) {
            String a = in.next();
            if(a.equals("!!end!!")) {
                break;
            }else {
                strList.add(a);
            }
        }
        strList.add(0,"begin");
        strList.add(strList.size(),"end");
        System.out.println(strList);
        String str = in.next();
        int sameNum;
        for(sameNum = 0 ;sameNum<strList.size() ;sameNum++ ) {
            if(strList.get(sameNum).equals(str)) {
                System.out.println("true");
                System.out.println(sameNum);
                break;
            }
        }
        if(sameNum == strList.size()) {
            System.out.println("false");
            System.out.println("-1");
        }
        for(sameNum = strList.size()-1 ;sameNum>=0 ;sameNum-- ) {
            if(strList.get(sameNum).equals(str)) {
                System.out.println(sameNum);
                break;
            }
        }
        if(sameNum==-1) {
            System.out.println("-1");
        }
        System.out.println(strList.get(0));
        strList.remove(0);
        System.out.println(strList);
        str = in.next();
        strList.set(1 ,str);
        System.out.println(strList);
        str = in.next();
        ArrayList<String> strList1 = new ArrayList<>();
        for(int i=0 ;i<strList.size() ;i++) {
            if(strList.get(i).contains(str)) {
                strList1.add(strList.get(i));
            }
        }
        System.out.println(strList1);
        for(int i=0 ;i<strList.size() ;i++) {
            if(strList.get(i).equals(str)) {
                strList.remove(i);
                break;
            }
        }
        System.out.println(strList);
        strList.clear();
        System.out.println(strList+","+strList.size()+","+strList.isEmpty());
    }
}