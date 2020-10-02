package lab3;
public class BankAccount {
    public String name, id;
    public static double balance;
    BankAccount(String name, String id, double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
    }

    void deposit(double depAmount){
        balance=balance+depAmount;
    }

    void withdraw(double withAmount){
        if(balance>withAmount){
            balance= balance-withAmount;
        }
        else System.out.printf("Low Balance\n");
    }

    double getBalance(){
        return balance;
    }

    void display(){
        System.out.printf("Name: %s \nID: %s \nBalance: %f\n",name,id,balance);
        System.out.printf("\n\n");
    }
}