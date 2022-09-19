
public class BankAccount {
    private String name;
    private double accountBalance;

    /**
     * Initializes a new BankAccount.
     *
     * @param in_name The name of the account owner.
     * @param in_accountBalance The starting balance for the account.
     */    public BankAccount(String in_name, double in_accountBalance)
    {
        name = in_name;
        accountBalance = in_accountBalance;

    }

    /**
     * @return The name of the account owner.
     */
    public String GetName()
    {
        return name;
    }

    /**
     * @return The current account balance.
     */
    public double GetBalance()
    {
        return accountBalance;
    }

    /**
     * Deposits money into the account.
     * If the requested deposit amount is not a positive number, the account balance is unchanged
     * and the following error message is displayed to the user :
     *
     *   "Sorry, the amount deposited must be greater than 0."
     *
     * @param amount The amount to deposit into the account. Must be a positive number.
     * @return The amount deposited into the account. If no money could be deposited due to an error, return zero.
     */
    public double Deposit(double amount)
    {
        if(amount > 0) {
            accountBalance += amount;
            return amount;
        }
        else{
            return 0;
        }
    }

    /**
     * Withdraws money from the account. The user must withdraw a positive amount of money,
     * AND the user cannot withdraw more money than the current account balance, i.e. the user
     * cannot withdraw more money than they have. One of the following error messages is displayed
     * to the user, depending on the error reason:
     *
     *   "Sorry, the amount withdrawn must be greater than 0."
     *   "Sorry, you cannot withdraw more than the account balance."
     *
     * @param amount The amount to withdraw from the account. Must be a positive number.
     * @return The amount withdrawn from the account. If the requested amount could not be withdrawn due to an error,
     *   returns zero.
     */
    public double Withdraw(double amount)
    {
        if(amount > 0 && amount <= accountBalance){
            accountBalance -= amount;
            return amount;
        }
        else if(amount < 0){
            System.out.println("Sorry, the amount withdrawn must be greater than 0.");
            return 0;
        }
        else{
            System.out.println("Sorry, you cannot withdraw more than the account balance.");
            return 0;
        }
    }

    /**
     * Computes interest for the bank account and adds it to the balance.
     *
     * Interest added = account balance * number of years * interest rate
     *
     * Error messages:
     *   "Sorry, the number of years must be an integer greater than 0."
     *   "Sorry, the interest rate must be greater than 0."
     *
     * @param numYears The number of years to compute interest for. Must be a positive number.
     * @param interestRate The rate at which the account balance accumulates interest. Must be a positive number.
     * @return The amount of interest computed. If there is an error, returns zero.
     */
    public double AddInterest(int numYears, double interestRate)
    {
        if(numYears <= 0){
            System.out.println("Sorry, the number of years must be an integer greater than 0.");
        } else if (interestRate <= 0) {
            System.out.println("Sorry, the interest rate must be greater than 0.");
        }
        else{
            double amountAdded = accountBalance * numYears * interestRate;
            accountBalance += amountAdded;
            return amountAdded;
        }
        return 0.0;
    }

    /**
     * Returns a string representation of a BankAccount object. The string looks like this:
     * 
     *      Name: Serena Williams
     *      Account Balance: 1000000.00
     * 
     * @return String
     */
    public String toString()
    {
        String result = "Name: " + name + "/n" + "Account Balance: " + accountBalance;
        return result;
    }

    /**
     * NOTE: This is implemented for you. You do not have to implement this function.
     *
     * Compares two BankAccount objects. One BankAccount is considered to be equal to another if
     * their account owners and account balances are the same.
     *
     * @param other The BankAccount object to compare to this one.
     * @return true if the BankAccount objects are equal. Otherwise, false.
     */
    public boolean equals(Object other) 
    {
        // If points to the same object, return true
        if (other == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(other instanceof BankAccount)) {
            return false;
        }

        BankAccount otherAccount = (BankAccount) other;

        if (!name.equals(otherAccount.name)) {
            return false;
        }

        if (Math.abs(accountBalance - otherAccount.accountBalance) > 0.1) {
            return false;
        }

        return true;
    }
}
