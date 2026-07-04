import java.util.*;


public class Q86_countWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        int countWords=0;
        int count = 0;
        str.trim();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' ){
                countWords++;
                count=0;
            }else{
                count++;
            }
        }
        countWords++;
        System.out.printf("No.Words in '%s' is = %d",str,countWords);

    }
}
