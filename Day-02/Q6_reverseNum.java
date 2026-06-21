import java.util.Scanner;

public class Q6_reverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int n=num;
        int revNum=0;
        while(n>0){
            int ld=n%10;
            revNum=revNum*10+ld;
            n=n/10;
        }
        System.out.printf("reverse number of %d is %d",num,revNum);
    }
}
