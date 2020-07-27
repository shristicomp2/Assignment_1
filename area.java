public class area
{
    void area1(int sq)
    {
        int a = sq*sq;
         System.out.println("Area of square is "+a);
    }
    void area1(int l,int b)
    {
        float rec=l*b;
        System.out.println("Area of rectangle is "+rec );
    }
    void area1(double r)
    {
        double pi=3.14;
        double cir=pi*r*r;
        System.out.println("Area circle is " +cir);
    }
}