import java.util.*;

public class Q91_checkAnagramsStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.nextLine();
        System.out.println("Enter second string:");
        String str2=sc.nextLine();
        boolean flag=true;

        if(str1.length()!=str2.length()){
            flag=false;
        }
        int freq[]=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0){
                flag=false;
            }
        }
        if(flag){
            System.out.printf("'%s' and '%s' are Anagram.",str1,str2);
        }
        else{
            System.out.printf("'%s' and '%s' are NOT Anagram.",str1,str2);
        }
    }
}
