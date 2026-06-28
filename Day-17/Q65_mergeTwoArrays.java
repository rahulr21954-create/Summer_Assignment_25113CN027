import java.util.*;


public class Q65_mergeTwoArrays {
    public static void main(String[] args) {
        int []arr1={1,3,2,4,7,8};
        int []arr2={2,8,5,3,9,1};

        int []newArr=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        while (i<newArr.length) {
            if(i<arr1.length){
                newArr[i]=arr1[i];
                i++;
            }
            else{
                newArr[i++]=arr2[j++];

            }
        }

        for(i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
