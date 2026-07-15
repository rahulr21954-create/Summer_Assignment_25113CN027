import java.util.*;


public class Q118_MiniLibrarySystem {
    static Scanner sc=new Scanner(System.in);
    static int MAX=100;
    static int id[]=new int[MAX];
    static String title[]=new String[MAX];
    static String author[]=new String[MAX];
    static boolean issued[]=new boolean[MAX];
    static int count=0;
    public static void main(String[] args) {
        
        while(true){
            System.out.println("======== Mini Library System ========");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.println("Enter Your Choice:");
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
                    System.out.println("__ Thank You! for using Mini Library System. __");
                    return;
            
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void addBook(){
        System.out.println("Enter Book ID:");
        int Id=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Title:");
        String Title=sc.nextLine();

        System.out.println("Enter Author Name:");
        String Author=sc.nextLine();

        id[count]=Id;
        title[count]=Title;
        author[count]=Author;
        count++;

        System.out.println("Book Added Successfuly!");
    }

    static void viewBooks(){
        for(int i=0;i<MAX;i++){
            if(id[i]!=0){
                System.out.println("------------------------------------");
                System.out.println("Book ID : "+id[i]);
                System.out.println("Title   : "+title[i]);
                System.out.println("Author  : "+author[i]);
                System.out.println("Issued  : "+issued[i]);
            }
        }
    }

    static void searchBook(){
        System.out.println("Search Book by Book ID:");
        int Id=sc.nextInt();

        for(int i=0;i<MAX;i++){
            if(id[i]==Id){
              System.out.println("------------------------------------");
                System.out.println("Book ID : "+id[i]);
                System.out.println("Title   : "+title[i]);
                System.out.println("Author  : "+author[i]);
                System.out.println("Issued  : "+issued[i]);
                
                System.out.println("\n Book Searched Successfully!");
                return;
            }
        }
        System.out.println("Book NOT Found!");
    }

    static void issueBook(){
        System.out.println("Issue Book by Book ID:");
        int Id=sc.nextInt();

        for(int i=0;i<MAX;i++){
            if(id[i]==Id){
                issued[i]=true;
                System.out.println("Book Issued Successfully!");
                return;
            }
        }
        System.out.println("Invalid Book ID!");
    }

    static void returnBook(){
        System.out.println("Return Book by Book ID:");
        int Id=sc.nextInt();

        for(int i=0;i<MAX;i++){
            if(id[i]==Id){
                issued[i]=false;
                System.out.println("Book Returned Successfully!");
                return;
            }
        }
        System.out.println("Invalid Book ID!");
    }

}
