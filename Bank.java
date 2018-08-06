package Bank2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.*;
public class Bank {

    public void createAccount(Customer customer, int num) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat date2=new SimpleDateFormat("yyyy");
        Date date1=new Date();
        String address;
        customer.setAccountNum(num);
        try {
           System.out.print("Customer Details: ");
           String num1;


            do{
                System.out.println("First name :");
                num1=sc.nextLine();
            }while(!Pattern.matches("[A-Za-z]*", num1));
            customer.setFirstName(num1);

            do{
                System.out.println("Middle name :");
                num1=sc.nextLine();
            }while(!Pattern.matches("[A-Za-z]*", num1));
            customer.setMiddleName(num1);


           do{
               System.out.println("Last name :");
               num1=sc.nextLine();
           }while(!Pattern.matches("[A-Za-z]*", num1));
           customer.setLastName(num1);

           int age;
          /* do {
               try{
                   System.out.print("Enter proper age :");
                   age = sc.nextInt();
               }
               catch(Exception e)
               {
                   System.out.println("invalid input");
                   sc.next();
               }
           }while(age<0);
           customer.setAge(age);*/





          String d;
          do {
              do {
                  System.out.println("Date of birth in format yyyy/MM/dd : ");
                  d = sc.next();
              } while (!Pattern.matches("^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$", d));
              try {
                  date = dateformat.parse(d);
                 // customer.setDate(date);
              } catch (ParseException z) {
                  System.out.println("Date is invalid");
              }
              age = Integer.parseInt(date2.format(date1)) - Integer.parseInt(date2.format(date));
          }while(age<=0);
          customer.setAge(age);
          customer.setDate(date);
          sc.nextLine();

          do {
              System.out.println("mobile num :");
              num1 = sc.nextLine();
          }while(!Pattern.matches("[0-9]{10}",num1));
          customer.setMobileNum(num1);

           do{
               System.out.println("email id : ");
               num1=sc.nextLine();
           }while(!Pattern.matches("([A-Za-z0-9._%+]*)[@]([A-Za-z]*)[.]([A-Za-z]*)",num1));
           customer.setEmail(num1);

           do {
               System.out.println("adhaar num :");
               num1 = sc.nextLine();
           }while(!Pattern.matches("[0-9]{12}",num1));
           customer.setAdhaarNum(num1);

           do{
               System.out.println("pan num :");
               num1=sc.nextLine();
           }while(!Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]", num1));
           customer.setPanNum(num1);


               System.out.println("Street : ");
           customer.setStreet(sc.nextLine());

           System.out.println("Area : ");
           customer.setArea(sc.nextLine());

           System.out.println("City : ");
           customer.setCity(sc.nextLine());

           System.out.println("State : ");
           customer.setState(sc.nextLine());

           do {
               System.out.println("PIN code : ");
               num1 = sc.nextLine();
           }while(!Pattern.matches("[0-9]{6}", num1));
           customer.setPinCode(num1);

           customer.setAccountNum(num);

           double num2=0;
           do{
               System.out.print("Enter amount to deposit: ");
               try{
                   num2=sc.nextDouble();
               }
               catch(Exception e)
               {
                   System.out.println("invalid amount");
                   sc.next();
               }
           }while(num2<=0);
           customer.setBalance(num2);

       }
       catch(Exception e)
       {
           System.out.println("invalid data");
           System.out.println("Inbuilt Exception --> " + e);
       }

    }
    public void displayAccount(Customer customer)
    {
        System.out.println("\nName : "+customer.getFirstName()+" "+customer.getMiddleName()+" "+customer.getLastName()+
                "\nAccount number : "+customer.getAccountNum()+
                "\nAccount Balance : "+customer.getBalance()+
                "\nAge : "+customer.getAge()+
                "\nDOB : "+DateFormat.getDateInstance().format(customer.getDate())+
                "\nEmail id "+customer.getEmail()+
                "\nAddress : "+customer.getStreet()+" "+customer.getArea()+" "+customer.getCity()+" "+customer.getState()+" "+customer.getPinCode()+
                "\nMobile number : "+customer.getMobileNum()+
                "\nAdhaar number : "+customer.getAdhaarNum()+
                "\nPAN number : "+customer.getPanNum());
    }
    public void displayBalance(Customer customer)
    {
        System.out.println("\nName : "+customer.getFirstName()+" "+customer.getMiddleName()+" "+customer.getLastName()+
                "\nAccount number : "+customer.getAccountNum()+
                "\nAccount Balance : "+customer.getBalance());
    }
}
