import java.util.*;

public class Q67_IntersectionTwoArr {
    public static void main(String[] args) {
        int []arr1={1,2,3,1,4,7,3};
        int []arr2={2,5,4,6,8};

        List<Integer> ll1=new ArrayList<>();
        List<Integer> ll2=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            ll1.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(ll1.contains(arr2[j])){
                ll2.add(arr2[j]);
            }
        }
        int newArr[]=new int[ll2.size()];
        for(int i=0;i<ll2.size();i++){
            newArr[i]=ll2.get(i);
        }

        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
