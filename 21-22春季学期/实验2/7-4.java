import java.util.Scanner;


class MyDate
{
    int y1,y2,m1,m2,d1,d2;
    //------
    void set(int y,int m,int d)
    {
        y1=y;m1=m;d1=d;
    }
    void get(int y,int m,int d)
    {
        y2=y;m2=m;d2=d;
    }

    //------
    int compare(MyDate d)
    {
        if(y1>y2)
            return 1;
        else if(y1<y2)
            return -1;
        else
        {
            if(m1>m2)
                return 1;
            else if(m1<m2)
                return -1;
            else
            {
                if(d1>d2)
                    return 1;
                else if(d1<d2)
                    return -1;
                else
                    return 0;
            }
        }
    }

    void print()
    {
        System.out.printf("%d/%d/%d %d",m1,d1,y1,compare(null));
    }



}


public class Main
{
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int y1=in.nextInt(),m1=in.nextInt(),d1=in.nextInt();
        int y2=in.nextInt(),m2=in.nextInt(),d2=in.nextInt();
        MyDate md=new MyDate();
        md.set(y1, m1, d1);
        md.get(y2, m2, d2);
        md.print();
    }
}

