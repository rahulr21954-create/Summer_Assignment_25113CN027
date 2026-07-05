import java.util.*;

public class Q96_removeDuplicateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        List<Character> ll=new ArrayList<>();
        String res="";

        for(int i=0;i<str.length();i++){
            if(!ll.contains(str.charAt(i))){
                ll.add(str.charAt(i));
            }
        }
        for(int i=0;i<ll.size();i++){
            res+=ll.get(i);
        }
        System.out.println("After removing Duplicates: "+res);
    }
}
