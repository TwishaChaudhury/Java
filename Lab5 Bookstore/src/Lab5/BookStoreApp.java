package Lab5;
import java.util.Scanner;
public class BookStoreApp {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        BookStore a=new BookStore();
        while(true){
            System.out.println("enter \"1\" to display the books: tittle - author - Isbn - quantity ");
            System.out.println("enter \"2\" to order new books");
            System.out.println("enter \"3\" to sell books");
            System.out.println("enter \"4\" to exit ");
            int num=scan.nextInt();
            if(num==1){
                a.display();
            }
            else if(num==2){
                System.out.println("enter  which ISBN coded book you want to :");
                String isbn=scan.next();
                System.out.println("enter how many copies you want :");
                int noOfCopies=scan.nextInt();
                a.order(isbn,noOfCopies);

            }
            else if(num==3){
                scan.nextLine();
                System.out.println("enter book name : ");
                String bookName=scan.nextLine();
                System.out.println("enter number of copies : ");
                int noOfCopies=scan.nextInt();
                a.sell(bookName,noOfCopies);
            }
            else if(num==4){
                System.exit(0);
            }
        }

    }
}