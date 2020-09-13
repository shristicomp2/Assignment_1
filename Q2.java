

import java.util.Scanner;
public class Q2
{
   
    double ans;
    String name;
    double salary;
   void init()
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the employee's name:");
           name=sc.nextLine();
           System.out.println("Enter the salary:");
           salary=sc.nextDouble();
           
          
        }
   double calc()
    {
        ans = 50.0/100*salary + salary;
        return ans;

    }
   public static void main()
    {
        Q2 obj=new Q2();
        obj. init();
      
      System.out.println("The total salary with commission: "+obj.calc());

    }

} 