public class bill
{
double bill;
int usage;
void get_data(int mins)
    {
        usage = mins;
    }
void generate_bill()
    {
        if(usage>0&&usage<=60)
         bill=20;
        else if (usage>60&&usage<=90)
         bill=20+12;
        else if (usage>90&&usage<=105)
         bill=20+12+8;
        else 
         bill=20+12+8+(usage-105)*2;
        System.out.println("The Bill is : "+bill);
    }
public static void  main()
{
    bill obj=new bill();
    obj.get_data(85);
    obj.generate_bill();
}
}