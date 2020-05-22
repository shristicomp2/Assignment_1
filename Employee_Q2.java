public class Employee_Q2
{
    String n;
    double sal,ans;
   void init(String name,double salary)
       {
           n=name;
           sal=salary;
        }
   void calc()
    {
        ans= 50.0/100*sal + sal;
     }
   void display()
     {
         System.out.println("The name of the employee is "+ n);
          System.out.println("The salary of the employee is "+ ans);
        }
   public static void main()
    {
        Employee_Q2 obj=new Employee_Q2();
        obj. init("Shristi",50000.0);
       obj.calc();
       obj.display();
    }
   
}