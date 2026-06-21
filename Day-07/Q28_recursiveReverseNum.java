import java.util.*;


public class Q28_recursiveReverseNum {
    static int reverseNum(int n,int sum){
        if(n==0) return sum;
        return reverseNum(n/10,sum*10+n%10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        System.out.printf("reverse of %d = %d",n,reverseNum(n,0));
    }
}
