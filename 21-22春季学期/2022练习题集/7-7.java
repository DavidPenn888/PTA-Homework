import java.util.Scanner;
class BankAccount
{
    public int start=0,take=0,in=0;
    public BankAccount(int s, int t, int i)
    {
        start=s;take=t;in=i;
    }
    public BankAccount(int s)
    {
        start=s;
    }
    public int getBlance()
    {
        return start;
    }
    public int withdraw()
    {
        return (start-take);
    }
    public int deposit()
    {
        return (start-take+in);
    }
}

public class Main
{
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int Start=in.nextInt();
        int Take=in.nextInt();
        int In=in.nextInt();
        BankAccount BankAccount=new BankAccount(Start,Take,In);
        System.out.println(BankAccount.getBlance());
        System.out.println(BankAccount.withdraw());
        System.out.println(BankAccount.deposit());
    }
}


