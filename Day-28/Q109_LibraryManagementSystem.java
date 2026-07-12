import java.util.*;

public class Q109_LibraryManagementSystem{
    public static class Book{
        int id;
        String title;
        String author;
        boolean isIssued;

        Book(int id,String title,String author){
            this.id=id;
            this.title=title;
            this.author=author;
        }

        void display(){
            System.out.println("----------------------------------------\n");
            System.out.print("Book ID  : "+id);
            System.out.print("\nTitle    : "+title);
            System.out.print("\nAuthor   : "+author);
            System.out.print("\nIssued   : "+isIssued);
            System.out.println();
        }
    }
    static Scanner sc=new Scanner(System.in);
    static List<Book> books=new ArrayList<>();
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("========== Library Management System ==========\n");
            System.out.println("[1.] Add Book");
            System.out.println("[2.] View Books");
            System.out.println("[3.] Search Book");
            System.out.println("[4.] Issue Book");
            System.out.println("[5.] Return Book");
            System.out.println("[6.] Delete Book");
            System.out.println("[7.] Exit");

            System.out.println("Enter choice:");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    deleteBook();
                    break;
                case 7:
                    System.out.println("__Thank You!__");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void addBook(){
        System.out.println("Enter Book ID:");
        int id=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Title:");
        String title=sc.nextLine();

        System.out.println("Enter Author Name:");
        String author=sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("*** Book Added Successfully! ***");
    }

    static void viewBooks(){
        for(Book book:books){
            book.display();
        }
    }

    static void searchBook(){
        System.out.println("Search Book by ID:");
        int id=sc.nextInt();

        for (Book book : books) {
            if(book.id==id){
                book.display();
                return;
            }
        }
        System.out.println("__Invalid Book ID__");
    }

    static void issueBook(){
        System.out.println("Issue Book by ID:");
        int id=sc.nextInt();

        for (Book book : books) {
            if(book.id==id){
                book.isIssued=true;
                System.out.println("*** Book Issued Successfully! ***");
                return;
            }
        }
        System.out.println("__Invalid Book ID__");
    }

    static void returnBook(){
        System.out.println("Return Book by ID:");
        int id=sc.nextInt();

        for (Book book : books) {
            if(book.id==id){
                book.isIssued=false;
                System.out.println("*** Book Returned Successfully! ***");
                return;
            }
        }
        System.out.println("__Invalid Book ID__");
    }

    static void deleteBook(){
        System.out.println("Delete Book by ID:");
        int id=sc.nextInt();

        for(int i=0;i<books.size();i++){
            if(books.get(i).id==id){
                books.remove(i);
                System.out.println("*** Book Removed Successfully! ***");
                return;
            }
        }
        System.out.println("__Invalid Book ID__");
    }


}