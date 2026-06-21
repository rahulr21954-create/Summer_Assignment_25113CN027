import java.util.*;


public class Q39_numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // printing asscending order
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>0;l--){
                System.out.print(l);
            }
            System.out.println();

        }
    }
}
