import java.util.*;

public class Q110_BankAccountManagementSystem {
    public static class Account{
        int accountNo;
        String name;
        double balance;

        Account(int accountNo,String name,double balance){
            this.accountNo=accountNo;
            this.name=name;
            this.balance=balance;
        }

        void display(){
            System.out.println("****************************************");
            System.out.println("Account No : "+accountNo);
            System.out.println("Name       : "+name);
            System.out.println("Balance    : "+balance);
        }
    }

    static Scanner sc=new Scanner(System.in);
    static List<Account> accounts = new ArrayList<>();
    public static void main(String[] args) {
        while(true){
            System.out.println("========== BANK ACCOUNT SYSTEM ==========\n");
            System.out.println("[1.] Add Account");
            System.out.println("[2.] View All Accounts");
            System.out.println("[3.] Search Account");
            System.out.println("[4.] Deposite Money");
            System.out.println("[5.] Withdraw Money");
            System.out.println("[6.] Transfer Money");
            System.out.println("[7.] Delete Account");
            System.out.println("[8.] Exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    addAccount();
                    break;
                case 2:
                    viewAccounts();
                    break;
                case 3:
                    searchAccount();
                    break;
                case 4:
                    depositeMoney();
                    break;
                case 5:
                    withdrawMoney();
                    break;
                case 6:
                    transferMoney();
                    break;
                case 7:
                    deleteAccount();
                case 8:
                    System.out.println("__ Thank You! __");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void addAccount(){
        System.out.println("Enter Account No:");
        int accountNo=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name=sc.nextLine();

        System.out.println("Enter Balance:");
        double balance=sc.nextDouble();

        accounts.add(new Account(accountNo, name, balance));
        System.out.println("*** Account Added Successfully! ***");
    }

    static void viewAccounts(){
        for(Account acc:accounts){
            acc.display();
        }
    }

    static void searchAccount(){
        System.out.println("Search Account by Account No:");
        int accountNo=sc.nextInt();
        for (Account account : accounts) {
            if(account.accountNo==accountNo){
                account.display();
                return;
            }
        }
        System.out.println("Invalid Account No!");
    }

    static void depositeMoney(){
        System.out.println("Deposite Money by Account No:");
        int accountNo=sc.nextInt();
        for (Account account : accounts) {
            if(account.accountNo==accountNo){
                System.out.println("Enter Money Which You Want to Deposite:");
                double Money=sc.nextDouble();
                
                account.balance+=Money;
                System.out.println("*** Money Deposite Successfully! ***");
                return;
            }
        }
        System.out.println("Invalid Account No:");
    }

    static void withdrawMoney(){
        System.out.println("Withdraw Money by Account No:");
        int accountNo=sc.nextInt();

        for (Account account : accounts) {
            if(account.accountNo==accountNo){
                System.out.println("Enter Money you Want to Withdraw");
                double Money=sc.nextDouble();

                account.balance-=Money;
                System.out.println("*** Money Withdraw Successfully! ***");
                return;
            }
        }
        System.out.println("Invalid Account No:");
    }

    static void transferMoney(){
        System.out.println("Enter the Account No from Which You Wanted to Transfer Money:");
        int senderAccountNo=sc.nextInt();
        System.out.println("Enter the Account No to which You wanted to Transfer Money:");
        int recieverAccountNo=sc.nextInt();
        System.out.println("Enter How much Money You Want to Transfer:");
        double Money=sc.nextDouble();

        for (Account account : accounts) {
            if(account.accountNo==senderAccountNo){
                account.balance-=Money;
            }   
            else if(account.accountNo==recieverAccountNo){
                account.balance+=Money;
            }
        }
        System.out.println("*** Money Transferred Successfully! ***");
    }

    static void deleteAccount(){
        System.out.println("Enter Account No Which You Wanted to Delete:");
        int accountNo=sc.nextInt();

        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).accountNo==accountNo){
                accounts.remove(i);
                return;
            }
            System.out.println("Invalid Account No!");
        }
    }

}
