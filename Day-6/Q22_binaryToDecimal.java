import java.util.Scanner;

public class Q22_binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary number:");
        int num=sc.nextInt();
        int n=num;
        int decimal=0;
        int count=1;
        while(n>0){
            int ld=n%10;
            decimal=decimal+ld*count;
            count*=2;
            n/=10;
        }
        System.out.printf("Decimal conversion of %d = %d",num,decimal);
    }
}
