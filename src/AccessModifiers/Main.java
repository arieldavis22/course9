package AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Account arielAccount = new Account("Ariel");
        arielAccount.deposit(1000);
        arielAccount.withdraw(500);
        arielAccount.withdraw(-200);
        arielAccount.deposit(-20);
        arielAccount.calculateBalance();
//        arielAccount.balance  = 5000;

        System.out.println("Balance on account is " + arielAccount.getBalance());
//        arielAccount.transactions.add(4500);
//        arielAccount.calculateBalance();
    }
}
