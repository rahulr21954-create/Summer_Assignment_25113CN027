import java.util.*;

public class Q79_rowWiseSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int r=sc.nextInt();
        System.out.println("Enter columns:");
        int c=sc.nextInt();
        int [][]mat=new int[r][c];
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=mat[i][j];
            }
            System.out.println("Sum of row-"+(i+1)+" = "+sum);
        }
    }
}
