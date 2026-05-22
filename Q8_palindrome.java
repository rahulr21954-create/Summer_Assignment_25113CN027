
import java.util.Scanner;

public class Q8_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int n=num;
        int ans=0;
        while(n>0){
            int ld=n%10;
            ans=ans*10+ld;
            n=n/10;
        }
        if(ans==num){
            System.out.printf("%d is a Palindrome number",num);
        }
        else{
            System.out.printf("%d is NOT palindrome number",num);
        }
    }
}
