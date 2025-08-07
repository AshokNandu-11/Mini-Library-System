public class Book {
    int id;
    String title;
    boolean isIssued;
    Book(int id,String title){
        this.id=id;
        this.title=title;
        this.isIssued = false;
    }
    @Override
    public String toString(){
        return id+"-"+title+"("+(isIssued?"Issued":"Available")+")";
    }
}
