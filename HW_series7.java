//S= 1-2+3-4+.....n
import java.util.Scanner;
class HW_series7
{
int n;
int ans=0;
void init()
{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ");
        n=sc.nextInt();
}
    void calc()
    {
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
               ans=ans-i;
            }
            else
            {
                ans=ans+i;
            }
    }
    System.out.println("The answer is "+ans);
}
public static void main()
{
    HW_series7 obj= new HW_series7();
    obj.init();
    obj.calc();
}
}