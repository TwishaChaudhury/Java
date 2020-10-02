package Lab4;
//import java.lang.reflect.Array;
import java.util.Scanner;
public class BankAccount{

  public static void main(String[] args){
      Scanner scan= new Scanner(System.in);
      int i=0, f=0;
      Bank account[ ]= new Bank[10];
      System.out.printf("For Exit Enter               : 0 \n");
      System.out.printf("For New Account Enter        : 1 \n");
      System.out.printf("For Deposit Enter            : 2 \n");
      System.out.printf("For Withdraw Enter           : 3 \n");
      System.out.printf("For Display Details Enter    : 4 \n");
      System.out.printf("For Display all account enter: 5 \n");
      while(true)
      {
          System.out.printf("Enter Option: ");
          int ch= scan.nextInt();
          if(ch==0) break;

          if(ch==1)
          {
                  System.out.printf("Create your Account\n");
                  System.out.printf("Enter Your Name: ");
                  scan.nextLine();
                  String name= scan.nextLine();
                  System.out.printf("Enter Your ID: ");
                  int id=scan.nextInt();
                  System.out.printf("Enter Your Balance: ");
                  double balance=scan.nextDouble();

                  account[i++]=new Bank(name,id,balance);
              }

          if(ch==2) {
              System.out.printf("Enter Your Id: ");
              int i_d=scan.nextInt();
              for(int j=0;j<i;j++){
                  if(account[j].id==i_d){
                      System.out.printf("Enter Deposit Amount: ");
                      double amount= scan.nextDouble();
                      account[j].deposit(amount);  f=1; break;
                  }
                  else  f=0;
              }
              if( f==0) System.out.printf("Account No: %d not exist. To Create New Account Enter 1\n",i_d);
          }

          if(ch==3) {
              System.out.printf("Enter Your Id: ");
              int i_d=scan.nextInt();
              for(int j=0;j<i;j++){
                  if(account[j].id==i_d){
                      System.out.printf("Enter Withdraw Amount: ");
                      double amount= scan.nextDouble();
                      account[j].deposit(amount); f=1; break;
                  }
                  else f=0;
              }
              if( f==0) System.out.printf("Account No: %d not exist. To Create New Account Enter 1\n",i_d);
          }

          if(ch==4) {
              System.out.printf("Enter Your Id: ");
              int i_d=scan.nextInt();
              for(int j=0;j<i;j++){
                  if(account[j].id==i_d){
                      account[j].display(); f=1; break;
                  }
                  else f=0;
              }
              if( f==0) System.out.printf("Account No: %d not exist. To Create New Account Enter 1\n",i_d);
          }

          if(ch==5) {
              for(int j=0;j<i;j++){
                      account[j].display();
                      System.out.printf("\n");
              }
          }
      }
  }
}