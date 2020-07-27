public class average
{
    double maths,chem,comp,avg;
    void init(double m,double ch,double c)
    {
        maths=m;
        chem=ch;
        comp=c;
    }
    void calc()
    {
        avg=(maths+chem+comp)/3;
    }
    void display()
    {
        System.out.print(avg);
    }
}