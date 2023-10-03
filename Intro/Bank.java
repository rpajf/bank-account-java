package ClassesFundamentals.Intro;

import java.text.DecimalFormat;

public class Bank {


    public Bank(String customerName, int accountNumber,double accountBalance,  String email ,String phoneNumber) {
        System.out.println("constructor with params");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        // maybe this is the best approach
    }
    public Bank() {
        // if an object is created with the Bank class, and it has not params
        // set these default valuess
        this("rafael2", 12345,  1500, "asdad@c","91239123");
        System.out.println("Empty constructor called");
    }
    // constructor with some parms


    public Bank( String customerName,int accountNumber, double accountBalance) {
        this(customerName, accountNumber, accountBalance, "asdasd@asd.com", "123123");
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");

    private int accountNumber;
    private double accountBalance;
    private String customerName;

   private String email;

    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void checkMoney(){

        System.out.println(getCustomerName()+ "'s " + "account balance " + df.format(getAccountBalance()));
    }
    public void depositMoney(double value){
        this.accountBalance += value;
        System.out.println("new balance after deposit " + df.format(getAccountBalance()));
    }
    public void withdrawMoney  (double value){
        if(getAccountBalance() < value || getAccountBalance() == 0){
            System.out.println("insufficient funds " + df.format(getAccountBalance()) + " you cannot withdraw " +  value);
            return;
        }
        this.accountBalance -= value;
        System.out.println("new balance after withdraw " + df.format(value) + " amount " + df.format(getAccountBalance()));


    }
    public void accountInfo(){
        System.out.println(getCustomerName() + "Account number: " + getAccountNumber() + "\n"  );
    }
}
