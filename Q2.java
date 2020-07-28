public class Q2
{
    String n;
    double sal,ans;
   void init(String name,double salary)
       {
           n=name;
           sal=salary;

        }
   double calc()
    {
        ans= 50.0/100*sal + sal;
        return ans;

    }
   public static void main()
    {
        Q2 obj=new Q2();
        obj. init("Shristi",50000.0);
       double result= obj.calc();
      System.out.println(result);

    }

} 