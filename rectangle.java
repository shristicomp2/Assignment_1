public class rectangle
{
    int len,breadth1,ans;
    void init(int length,int breadth)
    {
        len=length;
        breadth1=breadth;
    }
    double calc()
    {
        ans=len*breadth1;
        return ans;
    }
    public static void main()
    {
        rectangle obj=new rectangle();
        obj. init(5,4);
        double result= obj.calc();
        System.out.print(result);
    }
}