
import java.util.Scanner;

public class Q11_GCDtwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two numbers:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int gcd=1;
        for(int i=2;i<=Math.min(m,n);i++){
            if(m%i==0 & n%i==0){
                gcd=i;
            }
        }
        System.out.printf("GCD of %d and %d = %d",m,n,gcd);
    }
}

