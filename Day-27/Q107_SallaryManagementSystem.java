import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q107_SallaryManagementSystem {
    public static class Employee{
        int id;
        String name;
        int age;
        double sallary;

        Employee(int id,String name,int age,double sallary){
            this.id=id;
            this.name=name;
            this.age=age;
            this.sallary=sallary;
        }

        void display(){
            System.out.println("----------------------------\n");
            System.out.println("ID          : "+id);
            System.out.println("Name        : "+name);
            System.out.println("Age         : "+age);
            System.out.println("Sallary     : "+sallary);
        }
    }
    static Scanner sc=new Scanner(System.in);
        static List<Employee> employees=new ArrayList<>();
    public static void main(String[] args) {


        while(true){
            System.out.println("\n======== Employee Management System ========\n");
            System.out.println("[1.] Add Employee");
            System.out.println("[2.] View Employee");
            System.out.println("[3.] Search Employee");
            System.out.println("[4.] Calculate Net Salary");
            System.out.println("[5.] Delete Employee");
            System.out.println("[6.] Update Salary");
            System.out.println("[7.] Display Highest Salary");
            System.out.println("[8.] Exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                   calculateSallary();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    updateSallary();
                    break;
                case 7:
                    highestSallary();
                    break;
                case 8:
                    System.out.println("__Thank You__");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void addEmployee(){
                System.out.println("Enter ID:");
                int id=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Name:");
                String name=sc.nextLine();

                System.out.println("Enter Age:");
                int age=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Sallary:");
                double sallary=sc.nextDouble();

                employees.add(new Employee(id, name, age, sallary));
                System.out.println("Employee Added Successfully!");
                
    }

    static void viewEmployees(){
                for(Employee e : employees){
                    e.display();
                }
    }

    static void searchEmployee(){
        System.out.println("Search Employee by ID:");
        int id=sc.nextInt();
        for(Employee e:employees){
            if(id==e.id){
                e.display();
                return;
            }
        }
        System.out.println("Employee NOT Found!");
    }

    static void calculateSallary(){
        int totalSallary=0;
        for(Employee e: employees){
            totalSallary+=e.sallary;
        }
        System.out.println("Total Calculated Sallary = Rs. "+totalSallary);
    }

    static void deleteEmployee(){
        System.out.println("Delete Employee by ID:");
        int id=sc.nextInt();

        for(int i=0;i<employees.size();i++){
            if(employees.get(i).id==id){
                employees.remove(i);
                System.out.println("Employee deleted Successfully!");
                return;
            }
        }
        System.out.println("Employee NOT Found!");
    }

    static void updateSallary(){
        System.out.println("Update Sallary by ID:");
        int id=sc.nextInt();
        for(Employee e: employees){
            if(e.id==id){
                System.out.println("Enter new Sallary:");
                double sallary=sc.nextDouble();
                e.sallary=sallary;
                return;
            }
        }
        System.out.println("You entered invalid ID!");
    }

    static void highestSallary(){
        double max=0;
        for(Employee e : employees){
            if(e.sallary>max){
                max=e.sallary;
            }
        }
        System.out.println("Highest Sallary = Rs. "+max);
    }

}
