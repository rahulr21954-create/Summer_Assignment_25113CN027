import java.util.Scanner;

public class Q7_productOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int num=n;
        int productSum=1;
        while(n>0){
            int ld=n%10;
            productSum*=ld;
            n=n/10;
        }
        System.out.printf("Product of digits of %d = %d",num,productSum);
    }
}
