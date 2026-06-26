import java.util.*;

public class Q59_rotateArrRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter right rotating steps:");
        int k=sc.nextInt();
        List<Integer> ll=new ArrayList<>();
        for(int i=arr.length-k;i<arr.length;i++){
            ll.add(arr[i]);
        }

        int i=arr.length-1;
        int j=arr.length-k-1;
        while (i>=k && j>=0) {
            arr[i--]=arr[j--];
        }

        for(i=0;i<k;i++){
            arr[i]=ll.get(i);
        }
        
        for(j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        
    }
}
