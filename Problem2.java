package lab1;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number");
        int number=scan.nextInt();
        int flag=1;

        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                flag=0;
                break;
            }
            else flag =1;
        }
        if(flag==1) System.out.println("Prime Number");
        else System.out.println("Not Prime NUmber");
    }
}