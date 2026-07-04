import java.util.*;

public class Q88_removeSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                continue;
            }
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
