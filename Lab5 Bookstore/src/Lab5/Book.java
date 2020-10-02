package Lab5;
public class Book {
    public String bookTitle;String bookAuthor; String bookISBN; int numberOfCopies;

    Book(String bookTitle, String bookAuthor, String bookISBN, int numberOfCopies ){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookISBN=bookISBN;
        this.numberOfCopies=numberOfCopies;
    }

    public String toString(){
        return "Employee [Book Name=" + bookTitle + ", Author Name=" + bookAuthor + ",ISBN number=" + bookISBN +", NUmber Of Copies=" + numberOfCopies + "]";
    }
}