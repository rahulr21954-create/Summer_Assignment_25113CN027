import java.util.*;

public class Q60_moveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,0,2,3,0,0};
        int i=0;
        int j=1;
        while (i<j && j<arr.length) {
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else if(arr[i]!=0){
                i++;
                j++;
            }
            else{
                while(j<arr.length && arr[j]==0){
                    j++;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
