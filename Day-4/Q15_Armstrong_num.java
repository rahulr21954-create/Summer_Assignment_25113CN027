import java.util.Scanner;

public class Q15_Armstrong_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum=0;
        int count=0;
        int n=num;
        while(n>0){
            count++;
            n=n/10;
        }
        n=num;
        while (n>0) {
            int ld=n%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power*=ld;
            }
            sum+=power;
            n=n/10;
        }
        if(sum==num){
            System.out.printf("%d is an Armstrong Number",num);
        }
        else{
            System.out.printf("%d is NOT an Armstrong Number",num);
        }
    }
}
