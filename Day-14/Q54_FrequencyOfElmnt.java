import java.util.*;


public class Q54_FrequencyOfElmnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={23,32,43,32,12,56,76,43,32,12,32,12,43,43};
        System.out.println("Enter the number you wanted frequency:");
        int num=sc.nextInt();
        int frequency=0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                frequency++;
            }
        }
        System.out.printf("Frequency of %d = %d",num,frequency);
    }
}
