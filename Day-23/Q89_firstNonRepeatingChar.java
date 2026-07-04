import java.util.*;

public class Q89_firstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean flag=true;
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    flag=false;
                    break;
                }
                
            }
            if(flag){
                System.out.printf("First Non Repeating Character = '%c'",ch);
                break;
            }
        }
    }
}
