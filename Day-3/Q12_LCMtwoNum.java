import java.util.Scanner;

public class Q12_LCMtwoNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two numbers:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=Math.max(m,n);i<=m*n;i++){
            if(i%m==0 && i%n==0){
                System.out.printf("LCM of %d and %d = %d",m,n,i);
                break;
            }
        }
    }
}