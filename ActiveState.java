public class ActiveState implements AccountState {

    @Override
    public void deposit(Account account, double depositeAccount) {
        System.out.println("\n\t DEPOSIT");
        System.out.println("Account number  : " + account.getAccountNumber());
        System.out.println("Current balance : " + account.getBalance());
        System.out.println("Deposit amount  : " + depositeAccount);

        account.setBalance(account.getBalance() + depositeAccount);

        System.out.println("New balance     : " + account.getBalance());
        System.out.println();
    }

    @Override
    public void withdraw(Account account, double withdrawAccount) {
        System.out.println("\n\t WITHDRAW");
        System.out.println("Account number  : " + account.getAccountNumber());
        System.out.println("Current balance : " + account.getBalance());
        System.out.println("Withdraw amount : " + withdrawAccount);

        account.setBalance(account.getBalance() - withdrawAccount);

        System.out.println("New balance     : " + account.getBalance());
        System.out.println();
    }

    @Override
    public void activate(Account account) {
        System.out.println("This account is already activated!\n");
    }

    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!\n");
    }
}
