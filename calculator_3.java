import java.util.Scanner;
public class calculator_3
{
    void calci()
    {
        Scanner sc =new Scanner(System.in);
        
        int num1;
        int num2;
        char ch;
        double ans=0.0;
        
        System.out.println("Enter the first number: ");
        num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        num2=sc.nextInt();
        System.out.println("Enter the operation: ");
        ch=sc.next().charAt(0);
        
        switch(ch)
        {
          case '+':
           ans=num1+num2;
           break;
          case '-':
           ans=num1-num2;
           break;
          case '/':
           ans=num1/num2;
           break;
          case '*':
           ans=num1*num2;
           break;
        }
        System.out.println(ans);
    }
}
    