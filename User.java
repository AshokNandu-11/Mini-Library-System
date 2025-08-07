import java.util.ArrayList;
import java.util.List;

public class User {
    int userId;
    String name;
    List<Book> issuedBooks = new ArrayList<>();

    User(int userId,String name){
        this.userId= userId;
        this.name = name;
    }
    @Override
    public String toString(){
        return userId+"-"+name;
    }
}
