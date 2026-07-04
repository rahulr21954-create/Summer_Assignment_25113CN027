import java.util.*;

public class Q85_palindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();

        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while (i<j) {
            if(str.charAt(i++)!=str.charAt(j--)){
                flag=false;
            }
        }
        if(flag){
            System.out.printf("'%s' is Palindrome",str);
        }
        else{
            System.out.printf("'%s' is NOT Palindrome",str);
        }
    }
}
