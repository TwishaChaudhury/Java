package Lab7;
//Defines derived class SavingAccount extends from super class BankAccount   
public class SavingAccount extends BankAccount
{
// Instance variables to store saving account information
private double interest;
private double maxWithLimit;

// Parameterized constructor to initialize parameter values to instance variables
public SavingAccount(String memberName, double accountBalance, double maxWithLimit)
{
    // Calls the base class parameterized constructor
    super(memberName, accountBalance, 5000);
    this.interest = 0.05;
    this.maxWithLimit = maxWithLimit;
}// End of parameterized constructor

// Method to return interest rate
public double getInterestRate()
{
    return interest;
}// End of method

// Method to return maximum withdraw limit
public double getMaxWithLimit()
{
    return maxWithLimit;
}// End of method

// Method to change interest rate
public void setInterestRate(double intRate)
{
    interest = intRate;
}// End of method
   
// Method to change maximum withdraw limit
public void setMaxWithLimit(double maxWithLim)
{
    maxWithLimit = maxWithLim;
}// End of method

// Method to calculate interest and returns it
private double calculateInterest()
{
    return getAccountBalance() * interest;
}// End of method

// Method to calculate and return net balance
public double getNetBalance()
{
    return calculateInterest() + getAccountBalance();
}// End of method

// Method to withdraw amount
public void withdraw(double withAmount)
{
    // Checks if withdraw amount is less than the maximum withdraw limit
    if(withAmount < maxWithLimit)
        // Calls the base class withdraw method
        super.withdraw(withAmount);
   
    // Otherwise display error message
    else
        System.out.println("\n\t\t ERROR: Exceeding withdraw limit.");
}// End of method

// Overrides method to display saving account information
public void display()
{
    // Calls the base class display method
    super.display();
    System.out.println("\n Interest: " + calculateInterest() +
            "\n Maximum Withdraw Limit: " + maxWithLimit);
}// End of method
}// End of class SavingAccount