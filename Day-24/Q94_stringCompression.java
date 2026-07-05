import java.util.*;

public class Q94_stringCompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String ans="";
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                ans+=str.charAt(i-1);
                ans+=count;
                count=1;
            }
        }
        ans+=str.charAt(str.length()-1);
        ans+=count;
        System.out.println(ans);
    }
}
