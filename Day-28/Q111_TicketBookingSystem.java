import java.util.*;

public class Q111_TicketBookingSystem {
    public static class Ticket{
        int ticketId;
        String passengerName;
        int age;
        String source;
        String destination;
        int seatNo;

        Ticket(int ticketId,String passengerName,int age,String source,String destination,int seatNo){
            this.ticketId=ticketId;
            this.passengerName=passengerName;
            this.age=age;
            this.source=source;
            this.destination=destination;
            this.seatNo=seatNo;
        }

        void display(){
            System.out.println("----------------------------------------");
            System.out.println("Ticket ID      : "+ticketId);
            System.out.println("Passenger Name : "+passengerName);
            System.out.println("Age            : "+age);
            System.out.println("Source         : "+source);
            System.out.println("Destination    : "+destination);
            System.out.println("Seat No        : "+seatNo);
        }
    }

    static Scanner sc=new Scanner(System.in);
    static List<Ticket> tickets=new ArrayList<>();
    static int nextTicketId=101;
    static int totalSeats=25;
    static boolean isBooked[] = new boolean[totalSeats+1];
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("========== TICKET BOOKING SYSTEM ==========\n");
            System.out.println("[1.] Book Ticket");
            System.out.println("[2.] View All Bookings");
            System.out.println("[3.] Search Ticket");
            System.out.println("[4.] Cancel Ticket");
            System.out.println("[5.] Display Available Seats");
            System.out.println("[6.] Exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    viewTickets();
                    break;
                case 3:
                    searchTicket();
                    break;
                case 4:
                    cancelTicket();
                    break;
                case 5:
                    displayAvailableSeats();
                    break;
                case 6:
                    System.out.println("__ Thank You! __");
                    return;
            
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void bookTicket(){
        sc.nextLine();
        System.out.println("Enter Passenger Name:");
        String name=sc.nextLine();

        System.out.println("Enter Age:");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Source:");
        String source=sc.nextLine();

        System.out.println("Enter Destination:");
        String destination=sc.nextLine();

        displayAvailableSeats();

        System.out.println("Choose Seat No:");
        int seat=sc.nextInt();

        if(seat<1 || seat>totalSeats){
            System.out.println("Invalid seat No:");
            return;
        }

        isBooked[seat]=true;
        tickets.add(new Ticket(nextTicketId++, name, age, source, destination, seat));

        System.out.println("*** Seat Booked Successfully! ***");
        return;
    }

    static void displayAvailableSeats(){
        System.out.println("Available Seats:");
        boolean found=false;
        for(int i=1;i<isBooked.length;i++){
            if(!isBooked[i]){
                System.out.print(i+" ");
                found=true;
            }
        }
        if(!found){
            System.out.println("No any Seat Available:");
            return;
        }
        System.out.println();
        
    }

    static void viewTickets(){
        for (Ticket t:tickets) {
            t.display();
        }

    }

    static void searchTicket(){
        System.out.println("Search Ticket by Ticket Id:");
        int id=sc.nextInt();

        for (Ticket t : tickets) {
            if(t.ticketId==id){
                t.display();
                System.out.println("Ticket Searched Successfully!");
                return;
            }
        }
        System.out.println("Invalid Ticket Id!");
    }

    static void cancelTicket(){
        System.out.println("Cancel Ticket by Ticket Id:");
        int id=sc.nextInt();
        for(int i=0;i<tickets.size();i++){
            if(tickets.get(i).ticketId==id){
                tickets.remove(i);
                isBooked[tickets.get(i).seatNo]=false;
                System.out.println("Ticket Cancelled Successfully!");
                return;
            }
        }
    }



}
