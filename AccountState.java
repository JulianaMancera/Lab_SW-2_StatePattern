public interface AccountState{

    public void deposit(Account account, double depositAcount);
    public void withdraw(Account account, double withdrawAccount);
    public void suspend(Account account);
    public void activate(Account account);
    public void close(Account account);
}