public class Q4
{
    public static void main(int s,int P,int r,int n)
    {
        double A;
        switch (s)
        {
            case 1:
            double a=1+(r/100);
            double b=Math.pow(a,n);
            A=P*b;
            System.out.println(A);
            break;
            case 2:
            double i=(P*n*(n+1)*r)/(100*2*12);
            A=(P*n)+ i;
            System.out.println(A);
            break;
            default:
            System.out.println("Invalid");
            break;
        }
    } 
}                  