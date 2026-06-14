
import java.util.Scanner;

public class Q13_Fibonacci{
    public static int fibo(int n){
        if (n==0 || n==1) {
            return n==0?0:1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    
}
