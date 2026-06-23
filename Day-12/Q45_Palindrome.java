import java.util.*;

public class Q45_Palindrome{
    static boolean isPalindrome(int num){
        int n=num;
        int sum=0;
        while (n>0) {
            int ld=n%10;
            sum=sum*10+ld;
            n=n/10;
        }
        if(sum==num) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean flag=isPalindrome(num);
        if(flag){
            System.out.printf("%d is Palindrome",num);
        }
        else{
            System.out.printf("%d is NOT a Palindrome.",num);
        }
    }
}