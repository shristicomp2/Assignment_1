public class telephone_bill
{
    int n;
    double bill;
    void init(int calls)
    {
        n=calls;
    }
    void compute()
    {
        if(n>0&&n<=100)
            bill=100;
        else if(n>100&&n<=150)
            bill=100+(n-100)*2;
        else
            bill=100+50*2+(n-150)*2.5;
        System.out.println("The telephone bill is: " + bill);
    }
    public static void main()
    {
        telephone_bill obj= new telephone_bill();
        obj.init(106);
        obj.compute();
    }
}