public class calculator
{
    int a;
    int b;
    char c;
    int ans;
    void init(int n1,int n2,char ch)
    {
        a=n1;
        b=n2;
        c=ch;
    }
    void calc()
    {
        if(c=='+')
        {
            ans=a+b;
        }
         else if(c=='-')
        {
            ans=a-b;
        }
        else if(c=='*')
        {
            ans=a*b;
        }
        else if (c=='/')
        {
            ans=a/b;
        }
        else if (c=='%')
         {
            ans=a%b;
        }
         else
         {
             System.out.print("invalid");
            }
    }
    void display()
    {
        System.out.print(ans);
    }
}