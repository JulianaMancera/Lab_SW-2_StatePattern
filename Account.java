public class Account {

    private String accountNumber;
    private double balance;
    private AccountState state;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance);
        setState(new ActiveState());
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public AccountState getState() {
        return state;
    }

    public void deposit(double depositAmount) {
        state.deposit(this, depositAmount);
    }

    public void withdraw(double withdrawAmount) {
        state.withdraw(this, withdrawAmount);
    }

    public void activate() {
        state.activate(this);
    }

    public void suspend() {
        state.suspend(this);
    }

    public void close() {
        state.close(this);
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber='" + accountNumber + '\'' +
               ", balance=" + balance + '}';
    }
}
