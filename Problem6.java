package lab1;
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] arg){
        Scanner scan =new Scanner(System.in);
int i,j,s,k;
        System.out.println("Enter Number of elements");
        int n=scan.nextInt();
        if(n>9) n=9;      // if user gave a number>9 it will consider the number as 9;
        int space = n-1;  // spaces for 1st line is always n-1 times.
        for(i=1;i<=n;i++){
            for(s=space;s>0;s--){
                System.out.printf(" ");  //Loop for Space.
            }

            for(j=1;j<=i;j++){
                System.out.printf("%d",j);  // Loop for first half print.
            }

            for(k=j-2; k>=1;k--){
                System.out.printf("%d",k);  //loop for 2nd half print.
            }

            space--; // in every line spaces decrease by 1.
            System.out.printf("\n");
        }
    }
}