package Lab7;
//Defines derived class CurrentAccount extends from super class BankAccount
public class CurrentAccount extends BankAccount
{
// Instance variables to store current account information
private String tradeLicenseNumber;

// Parameterized constructor to initialize parameter values to instance variables
public CurrentAccount(String memberName, double accountBalance, String tradeLicenseNumber)
{
    // Calls the base class parameterized constructor
    super(memberName, accountBalance, 0);
    this.tradeLicenseNumber = tradeLicenseNumber;
}// End of parameterized constructor

// Method to return trade license number
public String getTradeLicenseNumber()
{
    return tradeLicenseNumber;
}// End of method
   
// Method to change trade license number
public void setTradeLicenseNumber(String tradeLicenseNumber)
{
    this.tradeLicenseNumber = tradeLicenseNumber;
}// End of method

// Overrides method to display current account information
public void display()
{
    // Calls the base class display method
    super.display();
    System.out.println("\n Trade License Number: " + tradeLicenseNumber);
}// End of method
}// End of class CurrentAccount