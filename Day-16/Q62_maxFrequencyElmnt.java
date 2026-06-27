import java.util.*;

public class Q62_maxFrequencyElmnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,1,1,2,5,6,3,4,1,2};

        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int freqArr[]=new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }
        int maxFreqElmnt=0;
        for(int i=0;i<freqArr.length;i++){
            if(maxFreqElmnt<freqArr[i]){
                maxFreqElmnt=i;
            }
        }
        System.out.println("Maximum Frequency Element = "+maxFreqElmnt);

    }
}
