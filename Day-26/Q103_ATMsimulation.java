import java.util.*;

public class Q103_ATMsimulation {
    static int balance=10000;

    static void deposite(double amount){
        balance+=amount;
        System.out.printf("Rs. %.2f deposited Successfully!\n",amount);
    }

    static void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid amount:");
        }
        else if(amount>balance){
            System.out.println("In Sufficient Balance:");
        }
        else{
            balance-=amount;
            System.out.printf("Rs. %.2f withdrawl Successfully!",amount);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ATMpin=5432;
        int attempts=3;

        while(attempts>0){
            System.out.println("Enter your ATM Pin:");
            int enteredATMpin=sc.nextInt();
            if(ATMpin==enteredATMpin){
                System.out.println("Login Successful!__");
                break;
            }
            else{
                System.out.println("Incorrect ATM Pin:");
                System.out.printf("Attempts left : %d\n",--attempts);
            }
        }
        if(attempts==0){
            System.out.println("Card Blocked: Invalid Attempts.");
            return;
        }

        while (true) {
            System.out.println("\n============ATM Menu============");
            System.out.println("[1.] Check Balance");
            System.out.println("[2.] Deposit");
            System.out.println("[3.] Withdrawl");
            System.out.println("[4.] Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Balance checked Successfully:");
                    System.out.println("Available Balance = "+balance);
                    break;
                case 2:
                    System.out.println("Enter amount to be deposite:");
                    double amount=sc.nextDouble();
                    deposite(amount);
                    break;
                case 3:
                    System.out.println("Enter amount to be withdraw:");
                    double withdrawAmount=sc.nextDouble();
                     withdraw(withdrawAmount);
                     break;
                case 4:
                    System.out.println("Thank! you for using our service.");
                     sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice:");
            }
           
        }
    }
}
