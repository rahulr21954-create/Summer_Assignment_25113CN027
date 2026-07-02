import java.util.*;


public class Q81_stringLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        char []ch=str.toCharArray();
        int length=0;
        
        for(char c:ch){
            length++;
        }
        System.out.printf("Length of '%s' = %d",str,length);
    }
}
