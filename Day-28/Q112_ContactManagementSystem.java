import java.util.*;


public class Q112_ContactManagementSystem {

    public static class Contact {
        String name;
        String phone;
        String email;

        Contact(String name,String phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
        }

        void display(){
            System.out.println("------------------------------");
            System.out.println("Name  : "+name);
            System.out.println("Phone : "+phone);
            System.out.println("Email : "+email);
            System.out.println("------------------------------");
        }
        
    }

    static Scanner sc=new Scanner(System.in);
    static List<Contact> contacts=new ArrayList<>();

    public static void main(String[] args) {
        
        while (true) {
            System.out.println("===== Contact Management System =====");
            System.out.println("[1.] Add Contact");
            System.out.println("[2.] View All Contacts");
            System.out.println("[3.] Search Contact");
            System.out.println("[4.] Update Contact");
            System.out.println("[5.] Delete Contact");
            System.out.println("[6.] Exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    deleteContact();
                    break;
                case 6:
                    System.out.println("__ Thank You! __");
                    return;
                default:
                    break;
            }
        }
    }

    static void addContact(){
        sc.nextLine();
        System.out.print("Enter Name : ");
        String name=sc.nextLine();
        System.out.println("\nEnter Phone Number : ");
        String phone=sc.nextLine();
        System.out.println("\nEnter Email : ");
        String email=sc.next();

        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact Added Successfully!");
        return;
    }

    static void viewContacts(){
        for (Contact contact : contacts) {
            contact.display();
        }
    }

    static void searchContact(){
        sc.nextLine();
        System.out.println("Search Contact by Name:");
        String name=sc.nextLine();

        for (Contact contact : contacts) {
            if(contact.name.equals(name)){
                contact.display();
                System.out.println("Contact Searched Successfully!");
                return;
            }
        }
        System.out.println("Invalid Name!");
    }

    static void updateContact(){
        sc.nextLine();
        System.out.println("Update Contact by Name:");
        String name=sc.nextLine();

        for (Contact contact : contacts) {
            if(contact.name.equals(name)){
                System.out.println("Enter new Phone Number:");
                String newPhone=sc.nextLine();

                System.out.println("Enter new Email:");
                String newEmail=sc.nextLine();
                
                contact.phone=newPhone;
                contact.email=newEmail;

                System.out.println("Contact Updated Successfully!");
                return;
            }
        }
        System.out.println("Invalid Name!");
    }

    static void deleteContact(){
        sc.nextLine();
        System.out.println("Delete Contact by Name:");
        String name=sc.nextLine();

        for (int i = 0; i <contacts.size(); i++) {
            if(contacts.get(i).name==name){
                contacts.remove(i);
                System.out.println("Contact Removed Successfully!");
                return;
            }
        }
        System.out.println("Invalid Name!");
    }

}
