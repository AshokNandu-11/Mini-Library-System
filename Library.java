import java.util.ArrayList;
import java.util.*;

public class Library {
    List<Book> books = new ArrayList<>();
    List<User> users = new ArrayList<>();
    void addBook(int id,String title){
        books.add(new Book(id, title));
        System.out.println("Book Added Successfully");
    }
    void addUser(int userId,String name){
        users.add(new User(userId,name));
        System.out.println("User Added Successfully");
    }
    void issueBook(int bookId,int userId){
        Book book = findBook(bookId);
        User user = findUser(userId);
        if(book==null || user==null){
            System.out.println("User or Book Not Found");
            return;
        }
        if (book.isIssued){
            System.out.println("Book Already Issued");
            return;
        }
        book.isIssued=true;
        user.issuedBooks.add(book);
        System.out.println("Book Issued Successfully to :"+user.name);

    }
    void returnBook(int userId,int bookId){
        Book book = findBook(bookId);
        User user= findUser(userId);
        if(book==null || user==null){
            System.out.println("Book or User Not found");
            return;
        }
        if(!book.isIssued || !user.issuedBooks.contains(book)){
            System.out.println("Book was Not Issued to this User");
            return;
        }
        book.isIssued=false;
        user.issuedBooks.remove(book);
        System.out.println("Book return Successfully");
    }
    void showBooks(){
        System.out.println("All Books");
        for(Book book : books){
            System.out.println(book);
        }
    }
    void issuedBooks(){
        System.out.println("Issued Books");
        for (User user:users){
            if(!user.issuedBooks.isEmpty()){
                System.out.println("User: "+user.name);
                for(Book book : user.issuedBooks){
                    System.out.println("Book :"+book.title);
                }
            }
        }
    }

    private User findUser(int userId) {
        for (User u:users){
            if(u.userId==userId) return u;
        }
        return null;
    }

    private Book findBook(int bookId) {
        for (Book b : books){
            if(b.id==bookId) return b;
        }
        return null;
    }

}
