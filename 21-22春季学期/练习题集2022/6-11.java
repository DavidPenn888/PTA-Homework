
public static List<String> convertStringToList(String line) {
        List<String> a = new ArrayList<>();
        String s[]=line.split("\\s+");
        for(int i=0 ;i<s.length ;i++) {
        a.add(s[i]);
        }
        return a;
        }

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


