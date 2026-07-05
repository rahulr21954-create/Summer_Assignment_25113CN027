import java.util.*;

public class Q93_checkStringRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String:");
        String str1=sc.nextLine();
        System.out.println("Enter second String:");
        String str2=sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("The strings are not rotations of eachother.");
        }
        else{
            String temp=str1+str1;
            if(temp.contains(str2)){
                System.out.println("Both strings are rotation of each other.");
            }
            else{
                System.out.println("The strings are NOT rotation of eachother.");
            }
        }

    }
}
