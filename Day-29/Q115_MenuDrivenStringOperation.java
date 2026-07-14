import java.util.*;

public class Q115_MenuDrivenStringOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");
        String str=sc.nextLine();

        String rev="";
        
        while(true){
            System.out.println("======== Menu Driven String Operation ========\n");
            System.out.println("[1.] Find Length");
            System.out.println("[2.] Convert to Upper Case");
            System.out.println("[3.] Convert to Lower Case");
            System.out.println("[4.] Reverse String");
            System.out.println("[5.] Check Palindrome");
            System.out.println("[6.] Count Vowels");
            System.out.println("[7.] Count Words");
            System.out.println("[8.] Replace a Character");
            System.out.println("[9.] Concatenate another String");
            System.out.println("[10.] Compare with another String");
            System.out.println("[11.] Exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Length = "+str.length());
                    break;
                case 2:
                    System.out.println("Upper Case : "+str.toUpperCase());
                    break;
                case 3:
                    System.out.println("Lower Case : "+str.toLowerCase());
                    break;
                case 4:
                    for(int i=str.length()-1;i>=0;i--){
                        rev+=str.charAt(i);
                    }
                    System.out.println("Reversed String : "+rev);
                    break;
                case 5:
                    if(str.equals(rev)){
                        System.out.println("String is Palindrome.");
                    }
                    else{
                        System.out.println("String is NOT Palindrome.");
                    }
                    break;
                case 6:
                    int countVowels=0;
                    for(int i=0;i<str.length();i++){
                        char ch=Character.toLowerCase(str.charAt(i));
                        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                            countVowels++;
                        }
                    }
                    System.out.println("No of Vowels = "+countVowels);
                    break;
                case 7:
                    String words[]=str.trim().split("\\s");
                    System.out.println("Number of Words = "+words.length);
                    break;
                case 8:
                    System.out.println("Enter Character to Replace:");
                    char oldChar=sc.next().charAt(0);
                    
                    System.out.println("Enter new Character");
                    char newChar=sc.next().charAt(0);
                    sc.nextLine();

                    str=str.replace(oldChar, newChar);
                    System.out.println("Updated String : "+str);
                    break;
                case 9:
                sc.nextLine();
                    System.out.println("Enter another String:");
                    String str2=sc.nextLine();
                    str=str.concat(str2);
                    System.out.println("Updated String : "+str);
                    break;
                case 10:
                    sc.nextLine();
                    System.out.println("Enter another String:");
                    String str3=sc.nextLine();
                    if (str.equals(str3)) {
                        System.out.println("Both Strings are Equal.");
                    }
                    else{
                        System.out.println("Both Strings are Different.");
                    }
                    break;
                case 11:
                    System.out.println("__ Thank You! __");
                    return;
            
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
