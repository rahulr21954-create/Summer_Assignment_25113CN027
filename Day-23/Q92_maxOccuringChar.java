import java.util.*;

public class Q92_maxOccuringChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();

        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        int max=-1;
        int idx=-1;
        for(int i=0;i<26;i++){
            if(freq[i]>max){
                max=freq[i];
                idx=i;
            }
        }
        char maxOccurChar=(char)(idx+'a');
        System.out.printf("Maximum Occuring Character = '%s'",maxOccurChar);
    }
}
