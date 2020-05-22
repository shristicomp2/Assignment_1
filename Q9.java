public class Q9
{
    public static void main(int d,int x) 
   
{
    switch (d)
    {
        case 1:
        int s = 0;
        int i = 2;
        
        while( i <= 20)
        {
            
            if(i % 4 == 0) 
            { 
                
                s = s - i;
            
            }
            else 
            {
                
                s= s + i;
            
            }
            
            i = i + 2;
        }
        
        System.out.println("Sum of the series : " +s);
        break;
        case 2:
          {
        int e=0;
        for(int a=-1;a<=20;a+=3)
        {
            e=e+ x/a;
        }
        System.out.println(e);
    }

    }

}
}