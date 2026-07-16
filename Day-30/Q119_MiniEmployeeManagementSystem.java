import java.util.*;

public class Q119_MiniEmployeeManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static int MAX = 100;
    static int empId[] = new int[MAX];
    static String empName[] = new String[MAX];
    static String empDept[] = new String[MAX];
    static double empSalary[] = new double[MAX];
    static int count=0;
    public static void main(String[] args) {

        while (true) {
            System.out.println("======== Mini Employee Management System ========");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();

            switch (choice) {
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
                    updateSalary();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    System.out.println("__ Thank You! for using Mini Employee Management System.");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void addEmployee() {
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Employee Department:");
        String department = sc.nextLine();

        System.out.println("Enter Employee Salary:");
        double salary=sc.nextDouble();

        empId[count]=id;
        empName[count]=name;
        empDept[count]=department;
        empSalary[count]=salary;
        count++;
        System.out.println("Employee Added Successfully!");
    }

    static void viewEmployees(){
        for(int i=0;i<MAX;i++){
            if(empId[i]!=0){
                System.out.println("-----------------------------------------");
                System.out.println("Employee ID : "+empId[i]);
                System.out.println("Name        : "+empName[i]);
                System.out.println("Department  : "+empDept[i]);
                System.out.println("Salary      : "+empSalary[i]);
            }
        }
    }

    static void searchEmployee(){
        System.out.println("Search Employee by ID:");
        int id=sc.nextInt();

        for(int i=0;i<MAX;i++){
            if(empId[i]==id){
              System.out.println("-----------------------------------------");
                System.out.println("Employee ID : "+empId[i]);
                System.out.println("Name        : "+empName[i]);
                System.out.println("Department  : "+empDept[i]);
                System.out.println("Salary      : "+empSalary[i]);
                
                System.out.println("\n Employee Searched Successfully!");
                return;
            }
        }
        System.out.println("Employee NOT Found!");
    }

    static void updateSalary(){
        System.out.println("Update Salary by ID:");
        int id=sc.nextInt();

        for(int i=0;i<MAX;i++){
            if(empId[i]==id){
                System.out.println("Enter Employee new Salary");
                double newSalary=sc.nextDouble();

                empSalary[i]=newSalary;
                System.out.println("Salary Updated Successfully!");
                return;
            }
        }
        System.out.println("Invalid Employee ID!");
    }

    static void deleteEmployee(){
        System.out.println("Delete Employee by ID:");
        int id=sc.nextInt();

        for(int i=0;i<MAX;i++){
            if(empId[i]==id){
                for(int j=i;j<MAX-1;j++){
                    empId[j]=empId[j+1];
                    empName[j]=empName[j+1];
                    empDept[j]=empDept[j+1];
                    empSalary[j]=empSalary[j+1];
                    count--;
                    if(empId[j]==0){
                        return;
                    }
                }
                return;
            }
        }
    }


}
