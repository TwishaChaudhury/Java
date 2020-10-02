package Lab4;
//import java.lang.reflect.Array;
//import java.util.Scanner;
class Bank {
  String name;
  int id;
  double balance;
  Bank(String n,int i,double d)
  {
      name=n;
      id=i;
      balance=d;
  }
  void deposit(double depAmmount)
  {
      balance+=depAmmount; 
  }
  void withdraw(double withAmmount)
  {
      if(balance-withAmmount>=0)
      {
          balance-=withAmmount;
      } 
      else {
          System.out.println("Insufficient Balance");
      }
  }
  double getbalance()
  {
      return balance;
  }
  void display()
  {
      System.out.println("Name : "+name);
      System.out.println("ID : "+id);
      System.out.println("Balance : "+balance);
  }


}

