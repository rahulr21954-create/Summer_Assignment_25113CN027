import java.util.*;

public class Q99_sortNamesAlphabatically {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        char []arr=str.toCharArray();

        for(int i=0;i<str.length()-1;i++){
            for(int j=1;j<str.length()-i;j++){
                if(arr[j]<arr[j-1]){
                    char temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
        System.out.println("Sorted String:");
        System.out.println(new String(arr));
        
    }
    
}
