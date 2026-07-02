import java.util.*;

public class Q84_lowerCaseToUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        String newStr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascci=ch;

            if(ascci>=97 && ascci<=122){
                ascci-=32;
            }
            newStr+=(char)ascci;
        }
        System.out.println(newStr);
    }
}