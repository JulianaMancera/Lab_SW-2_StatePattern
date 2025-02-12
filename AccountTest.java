public class AccountTest {
    public static void main(String[] args) {

        System.out.println("\nWelcome to Bank Account Demo :)");
        Account myAccount = new Account("1234", 10000);

        System.out.println("Creating account with account number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: "+ myAccount.getBalance() + "\n");
        // Activating account
        myAccount.activate();

        // Suspending account
        myAccount.suspend();

        // Re-activating suspended account
        myAccount.activate();

        // Depositing amount
        myAccount.deposit(1000.00);

        // Withdrawing amount
        myAccount.withdraw(100.00);

        // Closing account
        myAccount.close();

        // Trying to activate a closed account
        myAccount.activate();

        // Trying to suspend a closed account
        myAccount.suspend();

        // Trying to withdraw from a closed account
        myAccount.withdraw(500);

        // Trying to deposit into a closed account
        myAccount.deposit(1000);
    }
}
