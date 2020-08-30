import java.util.Scanner;
     class menu_program
{
    void init()
    {
         System.out.println("What would u like to do?");
         System.out.println("1.Find logarithm");
         System.out.println("2.Find absolute value");
         System.out.println("3.Find square root");
         System.out.println("2.Find random value");
    }
      
       void natlog()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num of which you want natural logarithm");
       double n=sc.nextDouble();
       double log=Math.log(n);
       System.out.println("The log is: "+log);
    }
       void absval()
   {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num of which you want Absolute value");
       double n=sc.nextDouble();
       double abs=Math.abs(n);
       System.out.println("The value is: "+abs);
    }
    void sqrt()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num of which you want Square root");
        double n=sc.nextDouble();
       double sq=Math.sqrt(n);
       System.out.println("The root is: "+sq);
    }
    void ran()
   {
   
       double r=Math.random();
       System.out.println("The num is: "+r);
    }
    public static void main()
       {
           
         menu_program obj=new menu_program();
        Scanner sc=new Scanner(System.in); 
        char c;
        int opt;
         do
      {
            obj.init();
            System.out.println("Enter your selection [1/2/3/4]");
            opt=sc.nextInt();
            if(opt==1)
            {
              obj.natlog();  
          }
          else if(opt==2)
          {
            obj.absval();
          }
          else if(opt==3)
          {
            obj.sqrt();
          }
          else if(opt==4)
          {
            obj.ran();
          }
          else
          {
              return;
          }
          System.out.println("Would you like to continue[y/n]");
          c=sc.next().charAt(0);
      }
      while(c=='y');
   }
    }
