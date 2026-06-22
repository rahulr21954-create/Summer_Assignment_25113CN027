import java.util.*;

public class Q43_prime {
    static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean flag=isPrime(num);
        if(flag){
            System.out.printf("%d is Prime Number.",num);
        }else{
            System.out.printf("%d is NOT a Prime Number.",num);
        }
    }
}
