import java.util.*;


public class Q46_Armstrong {
    static boolean isArmstrong(int num){
        int n=num;
        int sum=0;
        int count=0;

        while(n>0){
            count++;
            n=n/10;
        }
        n=num;
        while(n>0){
            int power=1;
            int ld=n%10;
            for(int i=1;i<=count;i++){
                power*=ld;
            }
            sum+=power;
            n=n/10;
        }
        if(sum==num) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean flag=isArmstrong(num);
        if(flag){
            System.out.printf("%d is Armstrong number.",num);
        }
        else{
            System.out.printf("%d is NOT Armstrong.",num);
        }
    }
}
