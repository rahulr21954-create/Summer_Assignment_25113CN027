
import java.util.Scanner;

public class Q5_sumDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int n=num;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld;
            n=n/10;
        }
        System.out.printf("sum of digits of %d = %d",num,sum);
    }
}
