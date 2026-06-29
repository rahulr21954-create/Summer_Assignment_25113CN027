import java.util.*;

public class Q70_SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's length:");
        int n=sc.nextInt();
        System.out.println("Enter array's elements:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int min=arr[i];
            int mindx=i;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[mindx]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
