public class bill_2
{
    double bill;
    int unit;
    void accept(int unit1)
    {
        unit=unit1;
    }
    void compute()
    {
        if(unit>0&&unit<=100)
         bill=500+ 40*unit/100;
        else if(unit>100&&unit<=300)
         bill=500+ 40*unit/100 + 60*(unit-100);
        else if(unit>100&&unit<=300)
         bill=500+ 40*unit/100 + 60*(unit-100);
        else
        bill=500+ 40*100/100 + 60*200/100 + (unit - 300);
        System.out.print("The bill is : Rs"+bill);
    }
    public static void main ()
    {
    bill_2 obj=new bill_2();
    obj.accept(67);
    obj.compute();
    }
}