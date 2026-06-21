import java.util.*;


public class Q40_characterPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Asscending Character
            for(int k=1;k<=i;k++){
                System.out.print(ch++);
            }
            //Decending Character
            --ch;
            for(int l=1;l<=i-1;l++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
}
