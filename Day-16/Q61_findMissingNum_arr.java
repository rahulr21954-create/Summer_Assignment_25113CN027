import java.util.*;

public class Q61_findMissingNum_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={2,4,5,1,7,6};
        int missingNum=0;
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                missingNum=i+1;
                break;
            }
        }
        System.out.println("Missing number = "+missingNum);

    }
}
