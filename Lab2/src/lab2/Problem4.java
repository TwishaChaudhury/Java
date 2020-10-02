package lab2;
import java.util.Scanner;

public class Problem4{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  Scanner input = new Scanner(System.in);
  int n, fact=1,number;
        
  number=input.nextInt();
  if(number<0)
  {
      System.out.println("NA"); 
      System.exit(0);
  }
  fact = factorial(number);   
  
  System.out.println(fact);  
 }  
}