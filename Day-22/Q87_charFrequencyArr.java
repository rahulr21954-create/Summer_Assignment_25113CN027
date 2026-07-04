import java.util.*;


public class Q87_charFrequencyArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        str.toLowerCase();
        char []arr=str.toCharArray();
        Arrays.sort(arr);
        int count=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                System.out.println(arr[i-1]+"->"+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+"->"+count);
    }
}

