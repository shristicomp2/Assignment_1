import java.util.Scanner;
class swap
{
    int a;
    int b;
    int c=0;
    void init()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first num");
    a=sc.nextInt();
    System.out.println("Enter the second num");
    b=sc.nextInt();
}
void calc()
{
    c=a;
    a=b;
    b=c;
    System.out.println(a);
    System.out.println(b);
   
} 
public static void main()
{
    swap obj=new swap();
    obj.init();
    obj.calc();
   
}
 }
