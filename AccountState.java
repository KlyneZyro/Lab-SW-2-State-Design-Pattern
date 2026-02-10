// AccountState.java
public interface AccountState {
    void deposit(Double amount, Account account);
    void withdraw(Double amount, Account account);
    void activate(Account account);
    void suspend(Account account);
    void close(Account account);
}