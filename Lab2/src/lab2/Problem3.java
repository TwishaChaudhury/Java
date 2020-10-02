package lab2;
import java.util.Scanner;
public class Problem3{ 
     public static void main(String args[]){
        int Size, i, EvenSum = 0;
		Scanner sc = new Scanner(System.in);
		Size = sc.nextInt();	
		int [] a = new int[Size];
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				EvenSum = EvenSum + a[i]; 
			}
		}		
		System.out.println(EvenSum);
     }
}
