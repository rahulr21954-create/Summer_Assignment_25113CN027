import java.util.*;


public class Q117_StudentRecordSystem {

    static Scanner sc=new Scanner(System.in);
    static int MAX=100;
    static int []rollNo=new int[MAX];
    static String []name=new String[MAX];
    static double []marks=new double[MAX];
    static int count=0;
    public static void main(String[] args) {
        
        while(true){
            System.out.println("======== Student Record System ========");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("__ Thank You! for using Student Record System. __");
                    return;            
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void addStudent(){
        System.out.println("Enter Roll No:");
        int roll=sc.nextInt();
        rollNo[count]=roll;
        sc.nextLine();
        System.out.println("Enter Name:");
        String Name=sc.nextLine();
        name[count]=Name;
        
        System.out.println("Enter Marks:");
        double Marks=sc.nextDouble();
        marks[count]=Marks;

        count++;
        System.out.println("Student added Successfully!");
    }

    static void viewStudents(){
        for(int i=0;i<MAX;i++){
            if(rollNo[i]!=0){
                System.out.println("-----------------------------------");
                System.out.println("Roll No : "+rollNo[i]);
                System.out.println("Name    : "+name[i]);
                System.out.println("Marks   : "+marks[i]);
            }
        }
    }

    static void searchStudent(){
        System.out.println("Search Student by Roll No:");
        int roll=sc.nextInt();

        for (int i = 0; i < MAX; i++) {
            if(rollNo[i]==roll){
                System.out.println("-----------------------------------");
                System.out.println("Roll No : "+rollNo[i]);
                System.out.println("Name    : "+name[i]);
                System.out.println("Marks   : "+marks[i]);

                System.out.println("Student Found Successfully!");
                return;
            }
        }

        System.out.println("Student NOT Found!");
    }

    static void updateStudent(){
        System.out.println("Update Student by Roll No:");
        int roll=sc.nextInt();

        for(int i=0;i<MAX;i++){
            sc.nextLine();
            if(rollNo[i]==roll){
                System.out.println("Enter new Name:");
                String Name=sc.nextLine();
                System.out.println("Enter new Marks:");
                double Marks=sc.nextDouble();

                name[i]=Name;
                marks[i]=Marks;
                System.out.println("Student Updated Successfully!");
                return;
            }
        }
        System.out.println("Invalid Roll No!");
    }

    static void deleteStudent(){
        System.out.println("Delete Student by Roll No:");
        int roll=sc.nextInt();

        for(int i=0;i<MAX-1;i++){
            if(rollNo[i]==roll){
                for(int j=i;j<MAX;j++){
                    rollNo[j]=rollNo[j+1];
                    name[j]=name[j+1];
                    marks[j]=marks[j+1];
                    if(rollNo[j]==0){
                        System.out.println("Student Deleted Successfully!");
                        return;
                    }
                }
            }
        }
        System.out.println("Invalid Roll No!");
    }



}