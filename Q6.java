class Q6
{ 
     public static void main(String str) 
    { 
    int n = str.length(); 
    int res = 0, len = 0; 
    for (int i = 0; i < n; i++) 
    {
        if (str.charAt(i) != ' ') 
            len++;
        else
        { 
            res = Math.max(res,len); 
            len = 0; 
        } 
    }  
    int s =Math.max(res,len);
     System.out.println(s); 
    } 
} 