import java.util.*;

public class Q95_longestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=sc.nextLine();
        String []words=str.split(" ");
        String longestWord="";

        for(String word : words){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println("Longest Word: "+longestWord);
        System.out.println("Length: "+longestWord.length());

    }
}
