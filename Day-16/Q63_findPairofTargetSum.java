import java.util.*;

public class Q63_findPairofTargetSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,5,9,4,6};
        System.out.println("Enter the Target:");
        int target=sc.nextInt();
        List<Integer> ll=new ArrayList<>();

        Arrays.sort(arr);

        int i=0;
        int j=arr.length-1;
        while (i<j) {
            int sum=arr[i]+arr[j];

            if(sum==target){
                ll.add(arr[i]);
                ll.add(arr[j]);
                break;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        for( i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" ");
        }
    }
}