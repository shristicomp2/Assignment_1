class time
{
int hrs;
int mins;
void input(int h, int m)
{
    hrs=h;
    mins=m;
}
void add_time(time obj1,time obj2)
{
    int total_mins=obj1.hrs*60+obj1.mins+obj2.hrs*60+obj2.mins;
    hrs=total_mins/60;
    mins=total_mins/60;
}
void display()
{
    System.out.println("Total time="+hrs+"hrs"+ mins +"mins");
}
public static void main()
{
    time t1=new time();
    time t2=new time();
    time t3=new time();
    
    t1.input(2,50);
    t2.input(3,50);
    t3.add_time(t1,t2);
    t3.display();
}
}