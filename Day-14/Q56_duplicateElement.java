import java.util.*;

public class Q56_duplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,1,3,4,2,5,4,3,3,7};

        System.out.println("Duplicate Elements are:");
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] ){
                    flag=true;
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            if(flag==true && arr[i]!=Integer.MIN_VALUE){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
