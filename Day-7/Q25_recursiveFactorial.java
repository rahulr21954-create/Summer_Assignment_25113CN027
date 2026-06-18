import java.util.*;

public class Q25_recursiveFactorial{
    static int factorial(int n){
        if(n==0 || n==1) return 1;
        int fact=n*factorial(n-1);
        return fact;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    System.out.printf("Factorial of %d = %d",n,factorial(n));
   } 
}
