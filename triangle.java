public class triangle
{
    int b;
    int h;
    int ans;
void init(int base,int height)
    {
        b=base;
        h=height;
    }
    double calc()
    {
    ans=(b*h)/2;
    return ans;
}
public static void main()
{
    triangle obj=new triangle();
    obj.init(2,6);
    double result=obj.calc();
    System.out.print(result);
}
}
