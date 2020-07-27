/*p=20000
t=5yr
r=2.5*/
public class SI
{
    int p;
    int t;
    double r;
    double si;
    void init(int pr,int ti,double ra)
    {
        p=pr;
        t=ti;
        r=ra;
    }
    double calc()
    {
        si=(p*t*r)/100;
        return si;
    }
    void display()
    {
        System.out.println(si);
    }
    public static void main()
    {
        SI obj = new SI();
        obj.init(20000,5,2.5);
        double ans = obj.calc();
        System.out.println(ans);
    }
}