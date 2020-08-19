import java.util.Scanner;
public class count 
{
   int num;
   void read()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number: ");
       num=sc.nextInt();
    }
   void count_digit()
    {
        int n=num;
        int count=0;
       while(n!=0)
       {
           int r=n%10;
           count++;
           int d=n/10;
        }
       System.out.println("The number of digit is equal to: "+count);
     }
   public static void main()
     {
         count obj=new count();
         obj.read();
         obj.count_digit();
        }
  }