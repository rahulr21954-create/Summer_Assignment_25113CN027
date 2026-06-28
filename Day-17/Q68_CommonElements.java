import java.util.*;

public class Q68_CommonElements {
    public static void main(String[] args) {
        int arr1[]={1,3,4,1,3,7,8,1};
        int arr2[]={2,1,4,5,3,3,6,1};

        List<Integer> ll1=new ArrayList<>();
        List<Integer> ll2=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            ll1.add(arr1[i]);

        }
        for(int j=0;j<arr2.length;j++){
            if(ll1.contains(arr2[j])){
                ll2.add(arr2[j]);
                System.out.println(Integer.valueOf(arr2[j]));
                ll1.remove(Integer.valueOf(arr2[j]));
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
