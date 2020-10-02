package Lab7;

import java.util.*;

//Defines driver class BankApp
public class BankApp
{
  // Scanner class object created
  static Scanner sc = new Scanner(System.in);
 
  // Static method to display main menu, accept user choice and returns user choice
  static int menu()
  {
      // Displays menu
      System.out.print("\n\n ************* BANK MENU *************");
      System.out.print("\n\t 1 - Add New Account. \n\t 2 - Deposit." +
              "\n\t 3 - Withdraw. \n\t 4 - Check Balance." +
              "\n\t 5 - Display Specific Account. \n\t 6 - Display All Accounts." +
              "\n\t 0 - Exit. \n\t\t What is your choice? ");

      // Accepts and returns user choice
      return sc.nextInt();
  }// End of method
 
  // Static method to display account type menu, accept user choice and returns user choice
  static int accType()
  {
      // Displays menu
      System.out.print("\n\n ************* Select Account Type *************");
      System.out.print("\n\t 1 - Saving Account. \n\t 2 - Current Account." +
              "\n\t\t What is your type of account? ");
     
      // Accepts and returns user choice
      return sc.nextInt();
  }// End of method
 
  // main method definition
  public static void main(String pyari[])
  {
      // Creates an object of class Bank
      Bank bank = new Bank();
     
      // Local variable to store data entered by the user
      String name;
      String accountNum;
      String tradeLicense;
      double balance;
      double maxWithLimit;
      double amt;
     
      // Loops till user choice is not 0
      do
      {
          // Calls the method to display main menu and accept use choice
          // Calls appropriate methods based on returned user choice
          switch(menu())
          {
              case 1:
                  // Calls the method to display account type menu and accept use choice
                  // Calls appropriate methods based on returned user choice
                  switch(accType())
                  {
                      case 1:
                          System.out.print("\n Enter Account Holder Name: ");
                          name = sc.next();
                          System.out.print("\n Enter Balance Amount: ");
                          balance = sc.nextDouble();
                          System.out.print("\n Enter Maximum Withdraw Limit: ");
                          maxWithLimit = sc.nextDouble();
                          bank.addAccount(name, balance, maxWithLimit);
                      break;
                      case 2:
                          System.out.print("\n Enter Account Holder Name: ");
                          name = sc.next();
                          System.out.print("\n Enter Balance Amount: ");
                          balance = sc.nextDouble();
                          System.out.print("\n Enter Trade License Number: ");
                          tradeLicense = sc.next();
                          bank.addAccount(name, balance, tradeLicense);
                      break;
                      default:
                          System.out.print("\n\t\t ERROR: Invalid Account Type.");
                  }// End of inner switch - case
              break;
              case 2:
                  System.out.print("\n Enter Account Number To Deposit: ");
                  accountNum = sc.next();
                  System.out.print("\n Enter Amount To Deposit: ");
                  amt = sc.nextDouble();
                  bank.deposit(accountNum, amt);
              break;
              case 3:
                  System.out.print("\n Enter Account Number To Withdraw: ");
                  accountNum = sc.next();
                  System.out.print("\n Enter Amount To Withdraw: ");
                  amt = sc.nextDouble();
                  bank.withdraw(accountNum, amt);
              break;
              case 4:
                  System.out.print("\n Enter Account Number To Check Balance: ");
                  accountNum = sc.next();
                  System.out.print("\n\t\t Your current balance: " +
                          bank.getBalance(accountNum));
              break;
              case 5:
                  System.out.print("\n Enter Account Number To Display Account Information: ");
                  accountNum = sc.next();
                  bank.display(accountNum);
              break;
              case 6:
                  System.out.print("\n\n *************** All Accounts Information ***************");
                  bank.display();
              break;
              case 0:
                  System.out.print("\n\t\t Thanks for using Pyari Bank App.");
                  System.exit(0);
              default:
                  System.out.print("\n\t\t ERROR: Invalid Choice.");
          }// End of outer switch - case
      }while(true);// End of do - while loop
  }// End of main method
}// End of class BankApp
