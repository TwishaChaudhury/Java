package lab3;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.printf("Create your Account\n");
        System.out.printf("Enter Your Name: ");
        int x=scan.nextInt();
        String name= scan.nextLine();
        System.out.printf("Enter Your ID: ");
        String id=scan.nextLine();
        System.out.printf("Enter Your Balance: ");
        double balance=scan.nextDouble();

        BankAccount account=new BankAccount(name,id,balance);

        System.out.printf("Welcome to Your account\nTo access your account please enter option\n");

        System.out.printf("For Deposit Enter 1\nFor Withdraw Enter 2\nFor Display Enter 3\n For Exit Enter 0\n\n");
        while(true)
        {
            int ch=scan.nextInt();
            if(ch==1){
                System.out.printf("Enter Deposit Amount: ");
                double amount=scan.nextDouble();
                account.deposit(amount);
            }
            if(ch==2){
                System.out.printf("Enter Withdraw Amount: ");
                double amount=scan.nextDouble();
                account.withdraw(amount);
            }
            if(ch==3) account.display();

            if(ch==0) break;
        }
    }
}