import java.util.*;

public class Q98_commonCharInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1=sc.nextLine();
        System.out.println("Enter the second string");
        String str2=sc.nextLine();

        StringBuilder commonChars = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1 && commonChars.indexOf(String.valueOf(ch)) == -1) {
                commonChars.append(ch);
            }
        }
        System.out.println("Common characters: " + commonChars.toString());
    }
}
