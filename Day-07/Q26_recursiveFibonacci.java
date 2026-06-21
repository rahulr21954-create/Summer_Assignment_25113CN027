import java.util.*;


public class Q26_recursiveFibonacci {
    static int fibonacci(int n){
        if(n==0 || n==1){
            return n==0?0:1;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
