import java.util.Scanner;
public class Series_1
{
    int n,x;
    void get_data()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        x=sc.nextInt();
         System.out.print("Enter the no.of powers");
        n=sc.nextInt();
    }
    void computeSum()
   {
       double sum=0;
       for(int i=0;i<=n;i++)
       sum=sum + Math.pow(x,i);
       
       System.out.print(sum);
    }
    public static void main()
    {
        Series_1 obj= new Series_1();
        obj.get_data();
        obj.computeSum();
    }
}