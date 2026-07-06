import java.util.*;

public class Q97_mergeSortedArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter the elements of first array");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the size of second array");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter the elements of second array");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }

        int arr3[]=new int[n+m];

        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }
        }
        while(i<n){
            arr3[k++]=arr1[i++];
        }
        while(j<m){
            arr3[k++]=arr2[j++];
        }
        System.out.println("The merged sorted array is:");
        for(int l=0;l<arr3.length;l++){
            System.out.print(arr3[l]+" ");
        }
       }
}