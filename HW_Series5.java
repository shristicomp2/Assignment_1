


























































//s=x^1/1!+x^2/2!...+x^n/n!
import java.util.Scanner;
class HW_Series5
{
    int n,x;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n");
        n=sc.nextInt();
        System.out.println("Enter the value x");
        x=sc.nextInt();
    }
    int fact(int m)
    {
        int prod=1;
        for(int i=1;i<=m;i++)
        {
          prod=prod*i;
        }
        return prod;
    }
    void computeSum()
    {
        double sum=0;
        for (int i=1;i<=n;i++)
        {
            sum = sum + (Math.pow(x,i))/fact(i);
        }
        System.out.println("The sum of series is: "+sum);
    }
    public static void main()
    {
        HW_Series5 obj = new HW_Series5();
        obj.getData();
        obj.computeSum();
    }
}