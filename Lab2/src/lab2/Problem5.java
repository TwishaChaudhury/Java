package lab2;
import java.util.Scanner;
public class Problem5 {
    static int Global_var_for_removing_last_comma;
    public static void splitdigit(int num)
    {
         
       if (num == 0)  return ;
        
       int lastdigit = num % 10;
       
       splitdigit(num / 10);
      
       if(lastdigit==Global_var_for_removing_last_comma)
       {
           System.out.println(lastdigit);
       }
       else
       {
           System.out.print(lastdigit+",");
       }
       
       
       return ;
    }
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number;
        number=sc.nextInt();
        Global_var_for_removing_last_comma=number%10;
        splitdigit(number);
        
    }
}