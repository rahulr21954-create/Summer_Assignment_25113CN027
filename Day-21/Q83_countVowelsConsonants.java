import java.util.*;

public class Q83_countVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();

        int countVowels=0;
        int countConsonants=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' ') continue;
            else if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
            ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                countVowels++;
            }else{
                countConsonants++;
            }
        }
        System.out.printf("In '%s' Number of Vowels = %d , Consonants = %d",str,countVowels,countConsonants);
    }
}
