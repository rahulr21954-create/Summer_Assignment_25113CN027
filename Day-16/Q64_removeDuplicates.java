import java.util.*;

public class Q64_removeDuplicates {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,5,2,7,8,7,9,9};
        List<Integer> ll=new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(!ll.contains(arr[i])){
                ll.add(arr[i]);
            }
        }
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" ");
        }
    }
}
