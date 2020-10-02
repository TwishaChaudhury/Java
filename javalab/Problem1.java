package lab1;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] a){
       Scanner scan = new Scanner(System.in);
       System.out.println("Please Enter A Number");
        int number=scan.nextInt();
        EvOd(number);
    }

    public static void EvOd(int n){
        if(n%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}