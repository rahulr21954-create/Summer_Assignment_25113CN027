import java.util.*;

public class Q106_EmployeeManagementSystem {
    public static class Employee{
        int id;
        String name;
        int age;
        String department;
        String designation;
        double sallary;

        Employee(int id,String name,int age,String department,String designation,double sallary){
            this.id=id;
            this.name=name;
            this.age=age;
            this.department=department;
            this.designation=designation;
            this.sallary=sallary;
        }

        void display(){
            System.out.println("----------------------------\n");
            System.out.println("ID          : "+id);
            System.out.println("Name        : "+name);
            System.out.println("Age         : "+age);
            System.out.println("Department  : "+department);
            System.out.println("Designation : "+designation);
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
            System.out.println("[4.] Update Employee");
            System.out.println("[5.] Delete Employee");
            System.out.println("[6.] Display Department Employees");
            System.out.println("[7.] Calculate Annual Sallary");
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
                    updateEmployee();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    departmentEmployee();
                    break;
                case 7:
                    calculateSallary();
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

                System.out.println("Enter Department:");
                String department=sc.nextLine();

                System.out.println("Enter Designation:");
                String Designation=sc.nextLine();

                System.out.println("Enter Sallary:");
                double sallary=sc.nextDouble();

                employees.add(new Employee(id, name, age, department, Designation, sallary));
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

    static void updateEmployee(){
        System.out.println("Update Employee by ID:");
        int id=sc.nextInt();
        sc.nextLine();
        for(Employee e: employees){
            System.out.println("Enter new Name:");
            String name=sc.nextLine();
            
            System.out.println("Enter new Age:");
            int age=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter new Department:");
            String department=sc.nextLine();

            System.out.println("Enter new Designation:");
            String designation=sc.nextLine();

            System.out.println("Enter new Sallary:");
            double sallary=sc.nextDouble();
            if(e.id==id){
                e.name=name;
                e.age=age;
                e.department=department;
                e.designation=designation;
                e.sallary=sallary;
            }
        }
    }

    static void deleteEmployee(){
        System.out.println("Delete Employee by ID:");
        int id=sc.nextInt();

        for(int i=0;i<employees.size();i++){
            if(employees.get(i).id==id){
                employees.remove(i);
                return;
            }
        }
        System.out.println("Employee NOT Found!");
    }

     static void departmentEmployee(){
        System.out.println("Search Employee by Department:");
        String department=sc.nextLine();
        for(Employee e:employees){
            if(department==e.department){
                e.display();
                return;
            }
        }
        System.out.println("No any Employee found of this department!");
    }

    static void calculateSallary(){
        int totalSallary=0;
        for(Employee e: employees){
            totalSallary+=e.sallary;
        }
        System.out.println("Total Calculated Sallary = Rs. "+totalSallary);
    }
}
