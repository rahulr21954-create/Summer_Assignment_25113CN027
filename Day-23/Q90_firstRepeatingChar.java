import java.util.*;

public class Q90_firstRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           for(int j=i+1;j<str.length();j++){
            if(ch==str.charAt(j)){
                System.out.printf("First Repeating Character = '%c'",ch);
            }
           }
        }
        
    }
}
