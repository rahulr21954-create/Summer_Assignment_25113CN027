import java.util.*;

public class Q16_Armstrong_num_inRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range m to n:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        List<Integer> ll=new ArrayList<>();
        for(int i=m;i<=n;i++){
            int sum=0;
            int count=0;
            int num=i;
            while(num>0){
                count++;
                num/=10;
            }
            num=i;
            while (num>0) {
            int ld=num%10;
            int power=1;
            for(int j=1;j<=count;j++){
                power*=ld;
            }
            sum+=power;
            num=num/10;
        }
        if(sum==i){
            ll.add(i);
        }

        }
        System.out.printf("Armstrong number in range %d to %d:",m,n);
        System.out.println(ll);
    }
}
