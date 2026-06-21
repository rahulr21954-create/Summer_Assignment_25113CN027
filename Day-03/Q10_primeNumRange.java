
import java.util.*;

public class Q10_primeNumRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the range m to n:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        List<Integer> ll=new ArrayList<>();
        for(int i=m;i<=n;i++){
            boolean flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                }
            }
            if(flag==true){
                    ll.add(i);
                }
        }
        System.out.printf("The List of prime number in range %d to %d\n:",m,n);
        System.out.println(ll);

    }
}

