package lab1;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter A Number");
        int number=scan.nextInt();
      if(number==0)  System.out.println("1");
      if(number<0)   System.out.println("NA");
      else
        System.out.printf("%d",factorial(number));

    }
    public static int factorial(int n){
        if(n==0) return 1;
        else {
            int r=n*factorial(n-1);
            return r;
        }
    }
}