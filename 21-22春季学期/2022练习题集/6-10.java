public static int numofHan(String data[]) {
        int num=0;
        for(int i=0 ;i<data.length ;i++ ) {
        if(data[i].indexOf("汉",4)>0) {
        num++;
        }
        }
        return num;
        }