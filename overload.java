//august_assignment

class overload

{
    double series(double n)
    {
         double i,s=0.0;
       for( i=1;i<=n;i++)
        {
            s=s+(1/i);
            
        }
       return s;
    }
    double series(double a, double n)
	{
	    double sum = 0;
	    for (int i = 0; i < n; i++)
	    {
		sum = sum + ((3 * i + 1.0) / Math.pow(a, 3 * i + 2));
            }
		return sum;
	}
}