import java.util.Scanner;

public class Q24_XpowerN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        System.out.println("Enter the power:");
        int n=sc.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=x;
        }
        System.out.printf("%d to the power %d = %d",x,n,ans);
    }
}
