package lab1;
import java.io.PrintStream;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] arg)
    {
        int number, sum=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Number of elements");
        number = scan.nextInt();

        int array[ ]= new int[number];
        System.out.println("Enter Elementes");

        for(int i=0;i<number;i++)
        {
            array[i]= scan.nextInt();
            if(array[i]%2==0) sum=sum+array[i];
        }

        System.out.printf("Sum= %d", sum);
    }
}