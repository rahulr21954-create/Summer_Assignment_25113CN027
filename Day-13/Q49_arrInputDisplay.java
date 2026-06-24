import java.util.*;

public class Q49_arrInputDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter array's elements:");
        // array input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // array displaying
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
