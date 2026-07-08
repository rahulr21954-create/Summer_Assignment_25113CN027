import java.util.*;

public class Q102_votingEligibilitySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            String choice="check";
            while (choice.equals("check")) {
                System.out.println("Enter your choice as 'check' or 'quit'");
                choice=sc.nextLine();
                if(!choice.equals("check")){
                    break;
                }
                System.out.println("Enter your name:");
                String name=sc.nextLine();
                System.out.println("Enter your age:");
                int age=sc.nextInt();
                sc.nextLine();
                if(age>=18){
                    System.out.printf("Congratulation! '%s' \n",name);
                    System.out.println("You are eligible for vote.");
                }
                else{
                    System.out.printf("Sorry! '%s'",name);
                    System.out.println();
                    System.out.printf("You are not eligible for vote now. Wait for %d years.",18-age);
                    System.out.println();
                }
                
            }
            flag=false;
    }
    }
}
