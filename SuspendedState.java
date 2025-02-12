public class SuspendedState implements AccountState {

    @Override
    public void deposit(Account account, double depositAmount) {
        System.out.println("You cannot deposit into a suspended account!");
    }

    @Override
    public void withdraw(Account account, double withdrawAmount) {
        System.out.println("You cannot withdraw from a suspended account!");
    }

    @Override
    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("This account is already suspended!");
    }
    
    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
