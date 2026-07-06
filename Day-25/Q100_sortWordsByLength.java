import java.util.*;

public class Q100_sortWordsByLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=sc.nextLine();

        String arr[]=str.split(" ");
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j].length()<arr[j-1].length()){
                    String temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(String word : arr){
            System.out.print(word+" ");
        }
    }
}
