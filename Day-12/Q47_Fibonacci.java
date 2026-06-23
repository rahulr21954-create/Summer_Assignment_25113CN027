import java.util.*;


public class Q47_Fibonacci {
    static int fibonacci(int num){
        if(num==0 || num==1){
            return num==0?0:1;
        }
        int fibo = fibonacci(num-1)+fibonacci(num-2);
        return fibo;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    for(int i=0;i<num;i++){
        System.out.print(fibonacci(i)+" ");
    }
} 
}
