package Lab7;
//Defines an abstract class BankAccount
public abstract class BankAccount
{
// Instance variables to store account information
private String memberName;
private String accountNumber;
private double accountBalance;
private double minimumBalance;

   
// Parameterizes constructor to assign parameter values to instance variables
public BankAccount(String memberName, double accountBalance, double minimumBalance)
{
    accountNumber = 1000 + (int)(Math.random() * 89999) + "";
    this.memberName = memberName;
    this.accountBalance = accountBalance;
    this.minimumBalance = minimumBalance;
}// End of parameterized constructor
   
// Method to deposit amount
public void deposit(double depAmount)
{
    // Checks if amount is greater than zero
    if(depAmount > 0)
        // Adds the amount to balance
        accountBalance += depAmount;
    // Otherwise displays error message
    else
        System.out.println("\n\t\t ERROR: Invalid amount.");
}// End of method

// Method to withdraw amount
public void withdraw(double withAmount)
{
    // Checks if amount after subtraction from current balance
    // is greater than minimum balance      
    if((accountBalance - withAmount) > minimumBalance)
        accountBalance -= withAmount;
    else
        System.out.println("\n\t\t ERROR: Insufficient balance.");
}// End of method

// Method to display account information
public void display()
{
    System.out.println("\n Name: " + memberName + "\n Account Number: " + accountNumber +
            "\n Balance: " + accountBalance);
}// End of method
   
// Method to return balance
public double getAccountBalance()
{
    return accountBalance;
}// End of method
   
// Method to return account number
public String getAcctNumber()
{
    return accountNumber;
}// End of method

// Method to return account holder name
public String getMemberName()
{
    return memberName;
}// End of method

// Method to return minimum balance  
public double getMinimumBalance()
{
    return minimumBalance;
}// End of method

// Method to change account holder name
public void setMemberName(String memberName)
{
    this.memberName = memberName;
}// End of method
   
// Method to change minimum balance  
public void setMinimumBalance(double minimumBalance)
{
    this.minimumBalance = minimumBalance;
}// End of method
}// End of class BankAccount 