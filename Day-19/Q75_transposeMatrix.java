import java.util.*;

public class Q75_transposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows:");
        int r=sc.nextInt();
        System.out.println("Enter Column:");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }

        }
        int transpose[][]=new int[c][r];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]=mat[i][j];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
