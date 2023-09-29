package ClassesFundamentals;

public class Main {

    public static void main(String[] args) {

        Bank bank1 = new Bank();
        bank1.setCustomerName("RAfael");
        bank1.setAccountBalance(1000.87);
        bank1.depositMoney(100);
        bank1.checkMoney();
        bank1.withdrawMoney(2000);
        bank1.withdrawMoney(300);
    }
}
