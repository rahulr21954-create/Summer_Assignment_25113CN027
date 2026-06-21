import java.util.Scanner;

public class Q4_countDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int n=num;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.printf("number of digits in %d = %d",num,count);
    }
}
