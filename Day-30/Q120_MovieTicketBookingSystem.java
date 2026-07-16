import java.util.*;

public class Q120_MovieTicketBookingSystem {
    static Scanner sc=new Scanner(System.in);
    static int MAX=100;
    static int bookingId[]=new int[MAX];
    static String customerName[]=new String[MAX];
    static String movieName[]=new String[MAX];
    static int seats[]=new int[MAX];
    static int count=0;
    public static void main(String[] args) {
        while (true) {
            System.out.println("========== Movie Ticket Booking System ==========");
            System.out.println("1. Display Movies");
            System.out.println("2. Book Ticket");
            System.out.println("3. View All Bookings");
            System.out.println("4. Search Booking");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Exit");

            System.out.println("Enter Choice:");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    displayMovies();
                    break;
                case 2:
                    bookTicket();
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    searchBooking();
                    break;
                case 5:
                    cancelTicket();
                    break;
                case 6:
                    System.out.println("__ Thank You! for using Movie Ticket Booking System. __");
                    return;
            
                default:
                    break;
            }
        }
    }

    static void displayMovies(){
        System.out.println("\nAvailable Movies");
        System.out.println("1. Avengers");
        System.out.println("2. Pushpa 2");
        System.out.println("3. Kalki 2898 AD");
        System.out.println("4. Stree 2");
        System.out.println("5. Saiyaara");
    }

    static void bookTicket(){
        System.out.println("Enter Booking ID:");
        int id=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Customer Name:");
        String name=sc.nextLine();

        System.out.println("Enter Movie Name:");
        String movie=sc.nextLine();

        System.out.println("Enter number of seat:");
        int seat=sc.nextInt();

        bookingId[count]=id;
        customerName[count]=name;
        movieName[count]=movie;
        seats[count]=seat;
        count++;
        System.out.println("Ticket Booked Successfully!");
    }

    static void viewBookings(){
        for(int i=0;i<MAX;i++){
            if(bookingId[i]!=0){
                System.out.println("-----------------------------------------");
                System.out.println("Booking ID    : "+bookingId[i]);
                System.out.println("Customer Name : "+customerName[i]);
                System.out.println("Movie Name    : "+movieName[i]);
                System.out.println("Seats         : "+seats[i]);
            }
        }
    }

    static void searchBooking(){
        System.out.println("Search Booking by ID:");
        int id=sc.nextInt();

        for(int i=0;i<MAX;i++){
            if(bookingId[i]==id){
                System.out.println("-----------------------------------------");
                System.out.println("Booking ID    : "+bookingId[i]);
                System.out.println("Customer Name : "+customerName[i]);
                System.out.println("Movie Name    : "+movieName[i]);
                System.out.println("Seats         : "+seats[i]);

                System.out.println("Booking Searched Successfully!");
                return;
            }
        }
        System.out.println("Booking NOT Found!");
    }

    static void cancelTicket(){
        System.out.println("Cancel Tocket by ID:");
        int id=sc.nextInt();

        for(int i=0;i<MAX;i++){
            if(bookingId[i]==id){
                for(int j=i;j<MAX-1;j++){
                    bookingId[j]=bookingId[j+1];
                    customerName[j]=customerName[j+1];
                    movieName[j]=movieName[j+1];
                    seats[j]=seats[j+1];

                    if(bookingId[j]==0){
                        return;
                    }
                }
                return;
            }
        }
    }
    
}
