import java.util.Scanner;
public class HW_series8
{
    int n;
    double a;
    int s=0;
    int p=1;
    void init()
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value n");
         n=sc.nextInt();
    }
    void sum()
    {
        
        for(int i=1;i<=n;i++)
        {
            s=s+i;
        }
        
    }
    void product()
    {
       
        for(int j=1;j<=n;j++)
        {
            p=p*j;
        }
      
    }
    void calc()
    {
       a =s/p;
       System.out.println("The answer to the series is "+a);
    }
     public static void main()
    {
        HW_series8 obj = new HW_series8();
        obj.init();
        obj.sum();
        obj.product();
        obj.calc();
        
    }
}