import java.util.*;

public class Q51_largest_smallest {
    public static void main(String[] args) {
        int []arr={5,7,12,4,9,1,8};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.printf("Largest number = %d and Smallest number = %d",largest,smallest);
    }
}
