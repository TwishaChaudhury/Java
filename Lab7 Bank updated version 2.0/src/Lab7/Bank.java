package Lab7;
import java.util.ArrayList;

//Defines class Bank
public class Bank
{
// Creates an array list to store BankAccount objects
ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

// Method to add an BankAccount object ot array list accounts
private void addAccount(BankAccount acc)
{
    accounts.add(acc);
}// End of method

// Method to add an saving account to array list accounts
public void addAccount(String name, double balance, double maxWithLimit)
{
    // Creates an object of class SavingAccount using parameterized constructor
    SavingAccount sa = new SavingAccount(name, balance, maxWithLimit);
    // Calls the method to add the object to array list accounts
    addAccount(sa);
}// End of method

// Overrides method to add an current account to array list accounts
public void addAccount(String name, double balance, String tradeLicense)
{
    // Creates an object of class CurrentAccount using parameterized constructor
    CurrentAccount ca = new CurrentAccount(name, balance, tradeLicense);
    // Calls the method to add the object to array list accounts
    addAccount(ca);
}// End of method

// Method to search parameter account number and returns the found object
// If not found then returns null
private BankAccount findAccount(String accountNum)
{
    // Loops till number of accounts
    for(int c = 0; c < accounts.size(); c++)
        // Checks if current object account number is equals to parameter
        // account number
        if(accounts.get(c).getAcctNumber().equals(accountNum))
            // returns the current object as found
            return accounts.get(c);
    // Returns null for not found
    return null;
}// End of method

// Method to deposit parameter amt to parameter account number if found
// otherwise displays error message
public void deposit(String accountNum, double amt)
{
    // Calls the method to search the parameter account number
    BankAccount ba = findAccount(accountNum);
   
    // Checks if return object is not null
    if(ba != null)
        // Calls the method to deposit parameter amount to found object
        ba.deposit(amt);
   
    // Otherwise displays error message for not found
    else
        System.out.println("\n\t\t ERROR: Account number: " + accountNum +
                " not found for deposit.");
}// End of method

// Method to withdraw parameter amt to parameter account number if found
// otherwise displays error message
public void withdraw(String accountNum, double amt)
{
    // Calls the method to search the parameter account number
    BankAccount ba = findAccount(accountNum);
   
    // Checks if return object is not null
    if(ba != null)
        // Calls the method to withdraw parameter amount from found object
        ba.withdraw(amt);
   
    // Otherwise displays error message for not found
    else
        System.out.println("\n\t\t ERROR: Account number: " + accountNum +
                " not found for withdraw.");
}// End of method

// Method to return balance of the parameter account number
public double getBalance(String accountNum)
{
    // Calls the method to search the parameter account number
    BankAccount ba = findAccount(accountNum);
    // To store the balance
    double bal = 0.0;
   
    // Checks if returned object is not null
    if(ba != null)
    {
        // Checks if returned object is an object of SavingAccount
        if(ba instanceof SavingAccount)
        {
            // Type cast the current object to SavingAccount
            SavingAccount sa = (SavingAccount)ba;
            // Calls the method and assigns the return balance
            bal = sa.getNetBalance();
        }// End of inner if condition
       
        // Otherwise
        else
        {
            // Type cast the current object to BankAccount
            BankAccount bac = (BankAccount)ba;
            // Calls the method and assigns the return balance
            bal = bac.getAccountBalance();
        }// End of else
    }// End of outer if condition
   
    // Otherwise displays error message for not found
    else
        System.out.println("\n\t\t ERROR: Account number: " + accountNum +
                " not found to check balance.");

    // Returns the balance
    return bal;
}// End of method

// Method to display the parameter account information
public void display(String accountNum)
{
    // Calls the method to search the parameter account number
    BankAccount ba = findAccount(accountNum);
   
    // Checks if returned object is not null
    if(ba != null)
        // Calls the method to display the parameter account number information
        ba.display();
   
    // Otherwise displays error message for not found
    else
        System.out.println("\n\t\t ERROR: Account number: " + accountNum +
                " not found to display information.");
}// End of method

// Method to display all account information
public void display()
{
    // Checks if number of accounts is 0 then display error message
    if(accounts.size() == 0)
        System.out.print("\n\n\t\t ERROR: No account available to display.");
   
    // Otherwise displays accounts information
    else
    {  
        // Loops till number of accounts
        for(int c = 0; c < accounts.size(); c++)
            // Calls the method to display current index position account information
            accounts.get(c).display();
    }// End of else
}// End of method
}// End of class Bank