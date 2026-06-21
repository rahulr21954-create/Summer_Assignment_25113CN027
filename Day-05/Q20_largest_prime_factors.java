import java.util.*;

public class Q20_largest_prime_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int max=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                boolean flag=true;
                for(int j=2;j<i;j++){
                    if(i%j==0) flag=false;
                }
                if(flag==true){
                    if(max<i){
                        max=i;
                    }
                }
            }
        }
    System.out.printf("Largest Prime Factor of %d = %d",num,max);
    }
}
