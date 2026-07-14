import java.util.*;

public class Q113_MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n========== Menu Driven Calculator ==========\n");
            System.out.println("[1.] Addition");
            System.out.println("[2.] Subtraction");
            System.out.println("[3.] Multiplication");
            System.out.println("[4.] Division");
            System.out.println("[5.] Modulus");
            System.out.println("[6.] Exit");
            System.out.println("\n============================================\n");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();
            if(choice<=5 && choice>=1){
                System.out.println("Enter First Number:");
                int n1=sc.nextInt();
                System.out.println("Enter Second Number:");
                int n2=sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Addition Result = "+(n1+n2));
                        break;
                    case 2:
                        System.out.println("Subtraction Result = "+(n1-n2));
                        break;
                    case 3:
                        System.out.println("Multiplication Result = "+(n1*n2));
                        break;
                    case 4:
                        if(n2!=0){
                            System.out.println("Division Result = "+(n1/n2));
                        }
                        else{
                            System.out.println("Division by zero is NOT Allowed!");
                        }
                        break;
                    case 5:
                        if(n2!=0){
                            System.out.println("Modulus Result = "+(n1%n2));
                        }
                        else{
                            System.out.println("Modulus by zero is NOT Allowed!");
                        }
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }
            }
            else if(choice==6){
                System.out.println("Thank You for Using The Calculator!");
                return;
            }
            else{
                System.out.println("Enter Valid Choice!");
            }
        }
    }
}
