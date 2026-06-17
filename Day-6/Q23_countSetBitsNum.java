import java.util.*;

public class Q23_countSetBitsNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("enter a number");
        int num=sc.nextInt();
        int n=num;
        int count=0;
         while(n>0){
            n= n & (n-1);
            count++;
         }
         System.out.printf("number of set bits in %d = %d",num,count);
    }
}
