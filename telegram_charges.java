public class telegram_charges
{
    int n;
    int bill;
    void init(int words)
    {
        n=words;
    }
    void compute()
    {
        if(n>0&&n<=15)
            bill=5;
        else
            bill=5+(n-15);
        System.out.println("The telegram_charges is: " + bill);
    }
    public static void main()
    {
        telegram_charges obj= new telegram_charges();
        obj.init(26);
        obj.compute();
    }
}