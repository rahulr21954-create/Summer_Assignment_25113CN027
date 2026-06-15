import java.util.*;

public class Q18_StrongNum {
    static int factorial(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int num=n;
        int sum=0;

        while(num>0){
            int ld=num%10;
            int fact=factorial(ld);
            sum+=fact;
            num/=10;
        }

        if(sum==n){
            System.out.printf("%d is a Strong Number.",n);
        }
        else{
            System.out.printf("%d is NOT a Strong Number.",n);
        }
    }
}
