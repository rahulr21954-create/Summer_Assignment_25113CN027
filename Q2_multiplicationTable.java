import java.util.*;
public class Q2_multiplicationTable {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%dx%d=%d\n",n,i,n*i);
        }
    } 
}