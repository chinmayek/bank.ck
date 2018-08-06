package Bank2;

//import java.util.HashMap;

interface Properties {
    public void withdraw(Customer customer, double amount);
    public  void deposit(Customer customer, double amount);
    public double interest(double balance);
    public void timePeriod();
}
