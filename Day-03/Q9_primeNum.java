
import java.util.*;

public class Q9_primeNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
       if(flag==false){
         System.out.printf("%d is NOT prime number",n);
       }
       else{
         System.out.printf("%d is prime number",n);
       }
    }

}