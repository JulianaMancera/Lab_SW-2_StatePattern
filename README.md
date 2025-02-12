# Lab_SW-2_StatePattern

## Bank Account Demo
&emsp;&emsp; A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.

- **Active accounts:** Allow deposits and withdrawals. <br>
- **Suspended accounts:** Disallow deposits and withdrawals transactions, but allow viewing account information. <br>
- **Closed accounts:** Disallow all transactions and viewing of account information. <br>

 &ensp; &ensp;Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.
<br>

*Implement the State pattern to improve code maintainability and flexibility:*

 &ensp;&ensp;**1. Define Account States:** Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState. <br>
  &ensp;&ensp;**2. Implement State Interface:** Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close. <br>
  &ensp;&ensp;**3. Implement State Behaviors:** Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions. <br>
 &ensp; &ensp;**4. Update Account Class:**
- Include attributes for accountNumber and balance. <br>
- Remove state-specific logic from the Account class. <br>
- Introduce a reference to the current AccountState object. <br>
- Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.<br>
 
### Logic:

- **If the account is active** <br>
 &ensp;You can either suspend it or close it.
- **If the account is suspended** <br>
 &ensp;You can either activate or close it. <br>
&ensp;No deposits and withdrawals allowed.
- **If the account is closed** <br>
 &ensp;You can neither suspend nor activate it. <br>
 &ensp;No deposits and withdrawals allowed.
