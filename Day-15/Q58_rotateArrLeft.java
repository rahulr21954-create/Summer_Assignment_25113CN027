import java.util.*;

public class Q58_rotateArrLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter left rotating steps:");
        int k=sc.nextInt();
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<k;i++){
            ll.add(arr[i]);
        }
        int i=0;
        int j=k;
        while(i<=arr.length-k-1 && j<arr.length){
            arr[i]=arr[j];
            i++;
            j++;
        }
        j=0;
        while(j<k){
            arr[i++]=ll.get(j++);
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
