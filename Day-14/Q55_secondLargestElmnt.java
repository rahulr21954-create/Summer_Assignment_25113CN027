import java.util.*;

public class Q55_secondLargestElmnt {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []arr={23,43,54,67,12,32,65,67};
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if(max<arr[i]){
            max=arr[i];
        }
        if(smax<arr[i] && max!=arr[i]){
                smax=arr[i];
            }
    }
    System.out.println("Second Largest Element = "+smax);
}
    
}