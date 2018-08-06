package Bank2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0, choice2 = 0, count = 0;
        int numberOfCustomers = 0;
        Customer[] customer=new Customer[50];
        HashMap<Integer, Customer> id = new HashMap<Integer, Customer>();
        Bank bank = new Bank();
        System.out.println("\n * * * Welcome to High Peak Bank * * * ");
        do {
            try {
                System.out.println("\n1) Open a new bank account \n2) Deposit to a bank account \n3) Withdraw to bank account \n4) Print balance " +
                        "\n5) Print account information \n6) Delete any account \n7) Quit \nEnter choice [1-7]: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        do {
                            System.out.println("Choose account: \n1. Savings account \n2. Current account \n3. Fixed account \n4. Recurring account \nEnter your choice : ");
                            choice2 = sc.nextInt();
                            if (choice2 < 1 && choice2 > 4)
                                System.out.println("invalid choice");
                        } while (choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4);
                        count++;
                        System.out.println("Enter the 4 digit pin :");
                        int pin=sc.nextInt();
                        customer[count]=new Customer(choice2);
                        id.put(count,customer[count]);
                        id.get(count).setPin(pin);
                        bank.createAccount(customer[count], count);
                        System.out.println("\nAccount successfully created with details ");
                        bank.displayAccount(customer[count]);
                        numberOfCustomers++;
                        break;
                    case 2:
                        System.out.println("Enter a account number");
                        int ac = sc.nextInt();
                        int temp = 0;
                        for (int i : id.keySet())
                        {
                            if (i == ac) {
                                System.out.println("Enter the 4 digit pin :");
                                pin = sc.nextInt();
                                if (pin == id.get(i).getPin()) {
                                    int k = id.get(i).getType();
                                    if (k == 2 || k == 1) {
                                        double da = 0;
                                        do {
                                            System.out.println("Enter a deposit amount");
                                            da = sc.nextDouble();
                                            if (da <= 0)
                                                System.out.println("Sorry!!!Deposit amount is invalid");
                                            else
                                                id.get(i).getAccount().deposit(id.get(i), da);
                                        } while (da <= 0);
                                    } else if (k == 3) {
                                        System.out.println("Fixed account will have one time deposit ");
                                        sc.nextLine();
                                    } else {
                                        System.out.println("This is recurring account \nplease deposit your amount at the given time");
                                        sc.nextLine();
                                    }
                                }
                                else
                                    System.out.println("incorrect pin");
                                temp = 1;
                            }
                        }
                        if (temp == 0)
                            System.out.println("Account not found");
                        break;
                    case 3:
                        System.out.println("Enter a account number");
                        ac = sc.nextInt();
                        temp = 0;
                        for (int i : id.keySet())
                        {
                            if (i == ac)
                            {
                                System.out.println("Enter the 4 digit pin :");
                                pin = sc.nextInt();
                                if (pin == id.get(i).getPin()) {
                                    double wa = 0;
                                    int k = id.get(i).getType();
                                    if (k == 2 || k == 1) {
                                        do {
                                            System.out.println("Enter a withdraw amount");
                                            wa = sc.nextDouble();
                                            if (wa <= 0)
                                                System.out.println("Sorry!!!withdraw amount is invalid");
                                            else
                                                id.get(i).getAccount().withdraw(id.get(i), wa);
                                        } while (wa <= 0);
                                    } else if (k == 3) {
                                        System.out.println("Fixed account will have one time withdraw ");
                                        sc.nextLine();
                                    } else {
                                        System.out.println("This is recurring account \nyou can't withdraw money before the given time period");
                                        sc.nextLine();
                                    }
                                }
                                else
                                    System.out.println("incorrect pin");
                                temp = 1;
                            }
                        }
                        if (temp == 0)
                            System.out.println("Account not found");
                        break;
                    case 4:
                        System.out.println("Enter a account number");
                        ac = sc.nextInt();
                        temp = 0;
                        for (int i : id.keySet())
                        {
                            if (i == ac) {
                                System.out.println("Enter the 4 digit pin :");
                                pin = sc.nextInt();
                                if (pin == id.get(i).getPin()) {
                                    bank.displayBalance(id.get(i));
                                }
                                else
                                    System.out.println("incorrect pin");
                                temp = 1;
                            }
                        }
                        if (temp == 0)
                            System.out.println("Account not found");
                        break;
                    case 5:
                        System.out.println("Enter a account number");
                        ac = sc.nextInt();
                        temp = 0;
                        for (int i : id.keySet())
                        {
                            if (i == ac) {
                                System.out.println("Enter the 4 digit pin :");
                                pin = sc.nextInt();
                                if (pin == id.get(i).getPin())
                                    bank.displayAccount(id.get(i));
                                else
                                    System.out.println("incorrect pin");
                                temp = 1;
                            }
                        }
                        if (temp == 0)
                            System.out.println("Account not found");
                        break;
                    case 6:
                        System.out.println("Enter the account number you want to delete a account ");
                        ac = sc.nextInt();
                        temp = 0;
                        for (int i : id.keySet()) {
                            if (i == ac) {
                                System.out.println("Enter the 4 digit pin :");
                                pin = sc.nextInt();
                                if (pin == id.get(i).getPin()) {
                                    id.remove(i);
                                    numberOfCustomers--;
                                    System.out.println("Account successfully deleted");
                                    break;
                                } else
                                    System.out.println("incorrect pin");
                                temp = 1;
                            }
                        }
                        if (temp == 0)
                            System.out.println("Account not found");
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
            }
            catch(Exception e)
            {
               // e.printStackTrace();
                System.out.println("Inbuilt Exception --> " + e);
                sc.nextLine();
            }
        } while(choice !=7);
    }
}