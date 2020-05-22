public class Q7
{
    public static void main(int m,int s,int g,int h, int c)
    {
        int t=m+c+h+g+s;
        int avg=t/5;
        if(avg>=90)
        {
            System.out.println("Science with Computers");
        }
        else if((avg>=80)&&(avg<90))
        {
             System.out.println("Science without Computers");
        }
         else if((avg>=70)&&(avg<80))
        {
             System.out.println("Commerce with Maths");
        }
        else if((avg>=60)&&(avg<70))
        {
             System.out.println("Commerce without Maths");
        }
    }
}