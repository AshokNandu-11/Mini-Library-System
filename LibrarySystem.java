import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;
        do {
            System.out.println("---------------------");
            System.out.println("1.Add Book");
            System.out.println("2.Register User");
            System.out.println("3.Issue Book");
            System.out.println("4.Return Book");
            System.out.println("5.Show All Books");
            System.out.println("6.Show Issued Books");
            System.out.println("0.Exit");
            System.out.print("Enter Your Choice  ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter BookId: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    library.addBook(bid,title);
                    break;
                case 2:
                    System.out.print("Enter UserId: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    library.addUser(uid,name);
                    break;
                case 3:
                    System.out.print("Enter BookId: ");
                    int ibid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter UserId: ");
                    int iuid = sc.nextInt();
                    library.issueBook(ibid,iuid);
                    break;
                case 4:
                    System.out.print("Enter BookId: ");
                    int bbid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter UserId: ");
                    int uuid = sc.nextInt();
                    library.returnBook(uuid,bbid);
                    break;
                case 5:
                    library.showBooks();
                    break;
                case 6:
                    library.issuedBooks();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.out.println("---------------------");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while (choice!=0);
        sc.close();
    }
}
