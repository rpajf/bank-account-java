package ClassesFundamentals;

public class Main {

    public static void main(String[] args) {

//        Bank bank1 = new Bank("rafa", 1234, "asda@", 1000, "123123");
        Bank bank1 = new Bank("rafa", 1312, 123);

        bank1.checkMoney();
        bank1.depositMoney(100);
        bank1.checkMoney();
        System.out.println( bank1.getAccountNumber());
        bank1.withdrawMoney(2000);
        bank1.withdrawMoney(300);
        Bank timBank = new Bank("Tim", 1000,5000);
        timBank.checkMoney();
        timBank.accountInfo();
    }
}
