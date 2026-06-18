import java.util.*;

public class Q27_recursiveSumOfDigits {
    static int digitsSum(int n) {
    if(n==0) return 0;
       return n%10+digitsSum(n/10);
        
    }
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number:");
         int n=sc.nextInt();
         System.out.printf("Sum of digits of %d = %d",n,digitsSum(n));
    }
}
