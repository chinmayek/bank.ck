package Bank2;

//import java.util.HashMap;
import java.util.Scanner;

public class Saving implements Properties{

    Scanner sc = new Scanner(System.in);
    public double interest(double balance){
        System.out.println("7% interest added");
        return (balance+(balance*0.07));

    }
    public void timePeriod(){
    }

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

    public void withdraw(Customer customer, double amount)
    {
        if (amount >= customer.getBalance()) {
            System.out.println("insufficient fund in account");
        }
        else {
            try {
                customer.setBalance(customer.getBalance() - amount);
                System.out.println("Amount withdrawn successfully");
                System.out.println("Available Balance: " + customer.getBalance());
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("TRANSACTION FAILURE");
            }

        }
    }

}
