public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0);

        myAccount.activate();
        myAccount.suspend();
        myAccount.activate();

        myAccount.deposit(1000.0);
        myAccount.withdraw(100.0);

        myAccount.close();

        myAccount.activate();    // expected: cannot activate closed account
        myAccount.suspend();     // expected: cannot suspend closed account

        myAccount.withdraw(500.0);
        myAccount.deposit(1000.0);
    }
}
