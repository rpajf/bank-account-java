package ClassesFundamentals;

import java.text.DecimalFormat;

public class Bank {

/*
    public Bank(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        AccountNumber = accountNumber;
        AccountBalance = accountBalance;
        CustomerName = customerName;
        Email = email;
        PhoneNumber = phoneNumber;
    }
*/

    public Bank() {
//        int accountNumber, double accountBalance, String customerName, String email, String phoneNumber
//        this.accountNumber = accountNumber;
//        this.accountBalance = accountBalance;
//        CustomerName = customerName;
//        Email = email;
//        PhoneNumber = phoneNumber;
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

        System.out.println("Account balance " + df.format(getAccountBalance()));
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
}
