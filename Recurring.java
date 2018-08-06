package Bank2;

public class Recurring implements  Properties{
    public void withdraw(Customer customer, double amount){
        System.out.println("Sorry!!! \nFrom your Recurring Account you can not withdraw money without completion of time period  ");
    }
    public void timePeriod(){ }

    public void deposit(Customer customer, double amount)
    {
        try
        {
            customer.setBalance(customer.getBalance()+amount);
            System.out.println("Amount deposited successfully");
            System.out.println("Account Balance is " + customer.getBalance());
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("TRANSACTION FAILURE");
        }
    }

    public double interest(double balance){
        System.out.println("7% interest added");
        return (balance+(balance*0.07));
    }

}
