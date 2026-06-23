import java.util.*;

public class Q48_PerfectNum {
    static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean flag=isPerfect(num);
        if(flag){
            System.out.printf("%d is a Perfect number.",num);
        }
        else{
            System.out.printf("%d is NOT a Perfect number.",num);
        }
    }
}
