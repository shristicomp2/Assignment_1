public class salary
{
    int r;
    int hr;
    double W;
    void init(int R, int H)
    {
        r=R;
        hr=H;
    }
    void calc()
    {
        if((hr>0)&&(hr<=35))
        {
            W=r*hr;
        }
        else if ((hr>35)&&(hr<=60))
        {
            W = (1.5*r)*hr;
        }
        else if ((hr>60)&&(hr<=70))
        {
          W=(2*r)*hr;
        }
        else
        {
            System.out.println("He is not allowed to work for more than 70hours in a week");
        }
    }
    void display()
    {
        System.out.println("His wages is equal to Rs. "+W);
    }
    public static void main()
    {
        salary obj=new salary();
        obj.init(100,45);
        obj.calc();
        obj.display();
    }
}