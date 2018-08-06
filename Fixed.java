package Bank2;

public class Fixed implements Properties {

    int z=1;
    public void withdraw(Customer customer, double amount){
        System.out.println("Sorry!!! \nFrom your Fixed Account you can not withdraw money without compltion of time period  ");}
    public double interest(double balance){
        System.out.println("7% interest added");
        return (balance+(balance*0.07));

    }
    public void deposit(Customer customer, double amount)
    {
        z++;
        if(z==1) {
            try {
                customer.setBalance(customer.getBalance() + amount);
                System.out.println("Amount deposited successfully");
                System.out.println("Account Balance is " + customer.getBalance());
            } catch (Exception e) {
                System.out.println("TRANSACTION FAILURE");
            }
        }
        else
            System.out.println("Sorry!!!  \nIn fixed account amount can be deposited only once");
    }

    public void timePeriod(){
        System.out.println("...");
    }
}
