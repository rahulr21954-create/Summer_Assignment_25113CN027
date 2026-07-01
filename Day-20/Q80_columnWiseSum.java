import java.util.*;

public class Q80_columnWiseSum {
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

        for(int j=0;j<c;j++){
            int sum=0;
            for(int i=0;i<r;i++){
                sum+=mat[i][j];
            }
            System.out.println("Sum of Column-"+(j+1)+" = "+sum);
        }
    }
}
