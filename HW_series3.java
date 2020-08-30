//S= 2!-4!+6!-8!+....n
import java.util.Scanner;
public class HW_series3

{
    int n;
    int ans;
    void input()
    {
        Scanner init = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n= init.nextInt();
    }
    void fact()
    {
        int fact=1;
        
        for(int i=n;i>0;i--)
        {
            fact = fact*i;
            for(int j =2;j<=n;j+=2)
        {
            if(j%4==0)
        {
            ans = ans -fact;
        }
        else
        {
            ans = ans+fact;
        }
    }
        }
        System.out.println("The answer to the series is: "+ ans);
    }
    public static void main()
    {
        HW_series3 obj = new HW_series3();
        obj.input();
        obj.fact();
        
   }
}