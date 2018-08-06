package Bank2;
import java.util.Date;
public class Customer {
    private String firstName;
    private String middleName;
    private String lastName;
    private String street;
    private String area;
    private String city;
    private String state;
    private String pinCode;
    private int age;
    private Date date;
    private String mobileNum;
    private String adhaarNum;
    private String panNum;
    private int accountNum;
    private double balance;
    private  String email;
    private Properties account ;
    public int type=0;
    public int pin;

    Customer(int i)
    {
        if(i==1) {
            account = new Saving();
            type = 1;
        }
        else if(i==2) {
            account = new Current();
            type = 2;
        }
        else if(i==3) {
            account = new Fixed();
            type = 3;
        }
        else {
            account = new Recurring();
            type = 4;
        }
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getType() {
        return type;
    }

    public Properties getAccount() {
        return account;
    }

    //public void setAccount(Properties account) {
       // this.account = account;
    //}


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance<1){
            System.out.println("Sorry!!!...Account should have atleast a minium balance of 1Rs");
        }
        else
            this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getAdhaarNum() {
        return adhaarNum;
    }

    public void setAdhaarNum(String adharNum) {
        this.adhaarNum = adharNum;
    }

    public String getPanNum() {
        return panNum;
    }

    public void setPanNum(String panNum) {
        this.panNum = panNum;
    }



}
