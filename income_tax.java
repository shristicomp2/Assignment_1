public class income_tax
{
    double i;
    String n;
    double tax;
    void accept(double income,String name)
    {
       i=income;
       n=name;
    }
    void compute()
    {
        if(i>0 && i<=40000)
         tax=0;
        else if(i>40000 && i<=70000)
         tax=(20*i)/100;
         else if(i>70000 && i<=100000)
         tax=(30*i)/100;
        else 
         tax=(40*i)/100;
        }
        void display()
    {
            System.out.print("Name: "+n+"/t"+"Tax: "+i);
        }
    
    public static void main ()
    {
       income_tax obj=new income_tax();
       obj.accept(75000.0,"Shristi");
       obj.compute();
       obj.display();
    }
}