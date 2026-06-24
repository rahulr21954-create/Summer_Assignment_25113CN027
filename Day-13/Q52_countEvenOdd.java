import java.util.*;


public class Q52_countEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={3,76,55,64,89,43,42,87,67,51,64};
        int countEven=0;
        int countOdd=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.printf("Number of Even numbers = %d and Odd numbers = %d",countEven,countOdd);
    }
}
