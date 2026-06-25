import java.util.*;

public class Q53_LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={4,6,9,3,12,32,54,8,78};
        System.out.println("Enter the nuber you want to search:");
        int num=sc.nextInt();
        int index=-1;
        for(int i=0;i<num;i++){
            if(arr[i]==num){
                if(arr[i]==num){
                    index=i;
                    break;
                }
            }
        }
        if(index!=-1){
            System.out.printf("%d is find at index = %d",num,index);
        }
        else{
            System.out.printf("%d is NOT founded:",num);
        }
    
    }
}
