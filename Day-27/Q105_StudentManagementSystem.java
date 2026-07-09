import java.util.*;

public class Q105_StudentManagementSystem {

    public static class Student{
        int id;
        String name;
        int age;
        String course;
        double marks;

        Student(int id,String name,int age,String course,double marks){
            this.id=id;
            this.name=name;
            this.age=age;
            this.course=course;
            this.marks=marks;
        }

        void display(){
            System.out.println("-------------------------------");
            System.out.println("ID     : "+id);
            System.out.println("Name   : "+name);
            System.out.println("Age    :"+age);
            System.out.println("Course : "+course);
            System.out.println("Marks  :"+marks);
        }

    }

    static Scanner sc = new Scanner(System.in);
        static List<Student> students=new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n======== Student Record Management System ========\n");
            System.out.println("[1.] Add Student");
            System.out.println("[2.] View Students");
            System.out.println("[3.] Search Student");
            System.out.println("[4.] Update Student");
            System.out.println("[5.] Delete Student");
            System.out.println("[6.] Exit");

            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
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
                    System.out.println("__Thank You__");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
            
        }
    }

    static void addStudent(){
        System.out.println("Enter ID:");
        int id=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name=sc.nextLine();

        System.out.println("Enter Age:");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course:");
        String course=sc.nextLine();

        System.out.println("Enter Marks:");
        double marks=sc.nextDouble();

        students.add(new Student(id, name, age, course, marks));
        System.out.println("Student Added Successfully!");
    }

    static void viewStudent(){
        if (students.isEmpty()) {
            System.out.println("No any record Found:");
            return;
        }
        for(Student s : students){
            s.display();
        }
    }

    static void searchStudent(){
        System.out.println("Enter Student ID:");
        int id=sc.nextInt();
        for(Student s:students){
            if(s.id==id){
                s.display();
                return;
            }
        }
        System.out.println("Student NOT Found:");
    }

    static void updateStudent(){
        System.out.println("Enter Student ID:");
        int id=sc.nextInt();

        for(Student s:students){
            if(s.id==id){
                sc.nextLine();
                System.out.println("Enter New Name:");
                s.name=sc.nextLine();

                System.out.println("Enter New Age:");
                s.age=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter New Course:");
                s.course=sc.nextLine();

                System.out.println("Enter New Marks:");
                s.marks=sc.nextDouble();

                System.out.println("Record updated Successfully!");
                return;
            }
        }
    }

    static void deleteStudent(){
        System.out.println("Enter Student ID:");
        int id=sc.nextInt();

        for(int i=0;i<students.size();i++){
            Student s=students.get(i);

            if(s.id==id){
                students.remove(i);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("No any Record Found!");
    }

}