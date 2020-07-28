//implement a calculator and show +-*/
//
public class calculator_2
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
        switch(c)
        {
            case '+':
            ans=a+b;
            break;
            case '-':
            ans=a-b;
            break;
            case '*':
            ans=a*b;
            break;
            case '/':
            ans=a/b;
            break;
        }
    }
void display()
    {
        System.out.print(ans);
    }
}