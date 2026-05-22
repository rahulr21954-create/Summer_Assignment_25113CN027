import java.util.Scanner;

public class Q3_factorial {
     public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.printf("Factorial of %d = %d",n,fact);
    }
}
