import java.util.*;

import javax.print.DocFlavor.STRING;

public class Q108_MarksSheetGenerationSystem {
    public static class Student{
        int rollNo;
        String name;
        int hindi;
        int english;
        int physics;
        int chemistry;
        int maths;

        Student(int rollNo, String name,int hindi,int english,int physics,int chemistry,int maths){
            this.rollNo=rollNo;
            this.name=name;
            this.hindi=hindi;
            this.english=english;
            this.physics=physics;
            this.chemistry=chemistry;
            this.maths=maths;
        }

        void display(){
            System.out.println("----------------------------------------");
            System.out.println("           ABC PUBLIC SCHOOL    ");
            System.out.println("              MARK SHEET\n");
            System.out.println("----------------------------------------");
            System.out.println("Roll No : "+rollNo);
            System.out.println("Name    : \n"+name);
            System.out.println("----------------------------------------");
            System.out.println("Subject         Marks");
            System.out.println("----------------------------------------");
            System.out.println("Hindi               "+hindi);
            System.out.println("English             "+english);
            System.out.println("Physics             "+physics);
            System.out.println("Chemistry           "+chemistry);
            System.out.println("Maths               "+maths);
            System.out.println("----------------------------------------");
            int total=hindi+english+physics+chemistry+maths;
            System.out.println("Total               "+total+"/"+500);
            double percentage=(double)(total*100)/500;
            System.out.println("Percentage          "+percentage+"%");
            if(percentage>=90){
                if(percentage>90){
                    System.out.println("Grade                 A+");
                }else
                    System.out.println("Grade                  A");
            }

            if(percentage<=80){
                if(percentage>80){
                    System.out.println("Grade                  B+");
                }else
                    System.out.println("Grade                   B");
            }

            if(percentage<=70){
                if(percentage>70){
                    System.out.println("Grade                   C+");
                }else
                    System.out.println("Grade                    C");
            }

            if(percentage<=60){
                if(percentage>60){
                    System.out.println("Grade                    D+");
                }else
                    System.out.println("Grade                     3D");
            }

            if(percentage<33){
                System.out.println("Result              FAIL");

            }
            else{
                System.out.println("Result               PASS");
            }
            System.out.println("----------------------------------------");
        }
        
    }

    static Scanner sc=new Scanner(System.in);
    static List<Student> students=new ArrayList<>();
    public static void main(String[] args) {
        
        while(true){
            System.out.println("========== MARKSHEET GENERATION SYSTEM ==========\n");
            System.out.println("[1.] Add Student");
            System.out.println("[2.] Display All Mark Sheets");
            System.out.println("[3.] Search Student");
            System.out.println("[4.] Update Marks");
            System.out.println("[5.] Delete Student");
            System.out.println("[6.] Class Topper");
            System.out.println("[7.] Class Average");
            System.out.println("[8.] Exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    for(Student s:students){
                        s.display();
                    }
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    classTopper();
                    break;
                case 7:
                    classAverage();
                    break;
                case 8:
                    System.out.println("__Thank You!__");
                    return;
                default:
                    System.out.println("Invalid Choice!");

            }
        }

    }

    static void addStudent(){
        System.out.println("Enter Roll No:");
        int rollNo=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name=sc.nextLine();

        System.out.println("_ Enter Marks _");
        System.out.print("Hindi: \n");
        int hindi=sc.nextInt();

        System.out.print("English: \n");
        int english=sc.nextInt();

        System.out.print("Physics: \n");
        int physics=sc.nextInt();

        System.out.print("Chemistry: \n");
        int chemistry=sc.nextInt();

        System.out.print("Maths: \n");
        int maths=sc.nextInt();

        students.add(new Student(rollNo, name, hindi, english, physics, chemistry, maths));
        System.out.println("Student Added Successfully!");
        
    }

    static void displayStudent(){
        for(Student s : students){
            s.display();
        }
    }

    static void searchStudent(){
        System.out.println("Search Student by Roll No:");
        int rollNo=sc.nextInt();
        
        for(Student s : students){
            if(s.rollNo==rollNo){
                s.display();
                return;
            }
            System.out.println("Invalid Roll No!");
        }
    }

    static void updateMarks(){
        System.out.println("Update Student Marks by Roll No:");
        int rollNo=sc.nextInt();

            System.out.println("_Enter new Marks_");
            
            System.out.print("Hindi: \n");
        int hindi=sc.nextInt();

        System.out.print("English: \n");
        int english=sc.nextInt();

        System.out.print("Physics: \n");
        int physics=sc.nextInt();

        System.out.print("Chemistry: \n");
        int chemistry=sc.nextInt();

        System.out.print("Maths: \n");
        int maths=sc.nextInt();

        for(Student s: students){
            if(s.rollNo==rollNo){
                s.hindi=hindi;
                s.english=english;
                s.physics=physics;
                s.chemistry=chemistry;
                s.maths=maths;
                System.out.println("Student Marks Updated Successfully!");
                return;
            }
            System.out.println("Invalid Roll No!");
        }
    }

    static void deleteStudent(){
        System.out.println("Enter Student's Roll No:");
        int rollNo=sc.nextInt();

        for(int i=0;i<students.size();i++){
            if(students.get(i).rollNo==rollNo){
                students.remove(i);
                System.out.println("Student Deleted Successfully!");
                return;
            }
            System.out.println("Invalid Roll No!");
        }
    }

    static void classTopper(){
        int max=0;
        for (Student s : students) {
            int total=s.hindi+s.english+s.physics+s.chemistry+s.maths;
            if(total>max){
                max=total;
            }
        }
        for (Student s : students) {
            int total=s.hindi+s.english+s.physics+s.chemistry+s.maths;
            if(total==max){
                System.out.println("Topper Name is : "+s.name);
            }
        }
    }

    static void classAverage(){
        int average=0;
        for(Student s: students){
            int total=s.hindi+s.english+s.physics+s.chemistry+s.maths;
            double percentage=(total*100)/500;
            average+=percentage;
        }
        average=average/students.size();
        System.out.println("Class Average = "+average+"%");
    }

}