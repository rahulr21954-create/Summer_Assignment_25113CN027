import java.util.*;

public class Q66_UnionOfArr {
    public static void main(String[] args) {
        int []arr1={1,2,3,1,4,7,3};
        int []arr2={2,5,4,6,8};
        int n=arr1.length+arr2.length;
        int j=0;
        List<Integer> ll=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i<arr1.length && !ll.contains(arr1[i])){
                ll.add(arr1[i]);
            }
            else if(j<arr2.length && !ll.contains(arr2[j])){
                ll.add(arr2[j++]);
            }
            else{
                j++;
            }
        }
        int []newArr=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            newArr[i]=ll.get(i);
        }

        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        
    }
}
