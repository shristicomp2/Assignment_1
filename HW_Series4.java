//S= 1+ (1+2)+(1+2+3)+......(1+2+3+.....+n)
import java.util.Scanner;
public class HW_Series4
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
        int S=0;
        int ans=0;
        for (int i=1;i<=n;i++)
        {
            S=S+i;
            ans=ans+S;
        }
        System.out.println("The answer to the series is: "+ ans);
        
    }
    public static void main()
    {
        HW_Series4 obj = new HW_Series4();
        obj.get_data();
        obj.calc();
        
    }
}
