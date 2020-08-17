//S= 2+5+10+17+26+.....n
import java.util. Scanner;
class HW_Series6
{
    int n;
    void get_data()
    { 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of terms");
       n= sc.nextInt();
    }
    void calc()
    {
        int s=0;
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            s=(i*i)+1;
            ans = ans+s;
        }
        System.out.println("The answer to the series is: "+ ans);
    }
    public static void main()
    {
        HW_Series6 obj = new HW_Series6();
        obj.get_data();
        obj.calc();
        
    }
}
    
