import java.util.*;

public class Q21_decimalToBinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number:");
        int num=sc.nextInt();
        int n=num;
        int binary=0;
        int count=1;
        while(n>0){
            int ld=n%2;
            binary=binary+ld*count;
            count*=10;
            n/=2;
        }
        System.out.printf("Binary conversion of %d = %d",num,binary);
    }
}



