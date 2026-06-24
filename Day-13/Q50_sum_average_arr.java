import java.util.*;

public class Q50_sum_average_arr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={23,56,43,8,96,65};

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        float average=sum/arr.length;
        System.out.printf("Sum = %d and Average = %d",sum,average);
    }
}