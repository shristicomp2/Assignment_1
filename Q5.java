public class Q5
{
    public static void main(int ch,int n)
    { 
    switch(ch)
    {
    case 1:
     for (int i=0;i<=n;i++)
    {
    for (int j=1;j<=i;j++)
    {
        System.out.print(j);
}
  System.out.println();
}
break;
case 2:
for(int i=n;i>0;i--)
{
    
  for (int j = 1; j <= i; j++)
{
    System.out.print((char)('A'+j-1)+"");
    
}
System.out.println();
}
break;
default:
{
System.out.println("Invalid");
}
break;
}
}
}