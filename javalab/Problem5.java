package lab1;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A Number");
           int number=scan.nextInt();

           recursion(number);
    }
    public static void recursion(int n){
        if(n==0) return ;
        recursion(n/10);
        System.out.printf("%d,", n % 10);
    }
}