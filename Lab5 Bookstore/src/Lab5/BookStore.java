package Lab5;
import java.util.Scanner;
import java.util.ArrayList;

public class BookStore {
    Scanner scan= new Scanner(System.in);
    ArrayList<Book> info = new ArrayList<>();
    void sell(String title, int qn){
        int f=0;
        for(int i=0;i<info.size();i++){
            if(info.get(i)!=null && info.get(i).bookTitle.equals(title)){
                if(info.get(i).numberOfCopies>=qn)
                info.get(i).numberOfCopies= info.get(i).numberOfCopies - qn;
                else System.out.println("Not Enough Book");
                f=1; break;
            }
        }
        if(f==0) System.out.println("Book Not Found");
    }


    void order(String isbn, int qn){               int  f=0;
           for(int i=0;i<info.size();i++){
               if(info.get(i)!=null && info.get(i).bookISBN.equals(isbn)){
                   info.get(i).numberOfCopies= info.get(i).numberOfCopies + qn;
                  f=1; break;
               }
           }
           if(f==0){ 
               System.out.printf("Enter Title: ");
               //scan.nextLine();
               String title= scan.nextLine();
               System.out.printf("Enter Author Name: ");
               String autr= scan.nextLine();
               Book in = new Book(title,autr,isbn,qn);
               info.add(in);
           }
    }


    void display(){
        for(int i=0;i<info.size();i++){
            Book in= info.get(i);
            System.out.println(in);
        }
    }
}
