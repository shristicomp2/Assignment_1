import java.util.Scanner;
public class select
{
    void test()
    {
        Scanner inp=new Scanner(System.in);
        int num;
        System.out.println("Enter a number(1..99): ");
        num=inp.nextInt();
        if(num>0 && num<10)
           System.out.println("You entered a single digit no.");
        else 
           System.out.println("You entered a double digit no.");
    }
}