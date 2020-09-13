public class Account
{
    double balance;
    long account_number;
   
    public Account ()
    {
        balance = 0.0;
    }
    
    void initialize (double amt)
    {
        balance = amt;
    }
    
    void deposit (double amount)
    {
        balance+= amount;
    }
    
    void withdraw (double amount)
    {
        balance-= amount;
    }
    
    double getBalance ()
    {
        return balance;
    }
}