import java.util.*;

public class Q71_BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,5,6,9};
        System.out.println("Enter target to be search:");
        int target=sc.nextInt();
        boolean flag=false;

        int first=0;
        int last=arr.length-1;
        while (first<last) {
            int mid=first+(last-first)/2;

            if(arr[mid]==target){
                System.out.printf("%d is found at index = %d",target,mid);
                flag=true;
                break;

            }
            else if(arr[mid]<target){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        if(!flag){
            System.out.printf("%d is NOT found.",target);
        }
    }
}
