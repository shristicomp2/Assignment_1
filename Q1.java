import java.util.Scanner;
public class Q1
{
  int rows;
 void init()
 
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of rows ");
     rows=sc.nextInt();
    
    }
 void calc()
    {
     int number = 1;
       
     for (int i = 1; i <= rows; i++) 
     { 
         for (int j = 1; j <= i; j++) 
         { 
             System.out.print(number + " "); number++; 

            } 
        System.out.println();
        }
    }
 public static void main()
    {
        Q1 obj=new Q1();
        obj.init();
        obj.calc();
    }
}