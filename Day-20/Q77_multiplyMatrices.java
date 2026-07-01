import java.util.*;

public class Q77_multiplyMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows for matrix-1:");
        int r1=sc.nextInt();
        System.out.println("Enter the columns of matrix-1");
        int c1=sc.nextInt();
        int mat1[][]=new int[r1][c1];

        System.out.println("Enter the rows of matrix-2:");
        int r2=sc.nextInt();
        System.out.println("Enter the columns of matrix-2:");
        int c2=sc.nextInt();
        int mat2[][]=new int[r2][c2]; 
        int mat[][]=new int[r1][c2]; 

        //Input Matrix-1
        System.out.println("Enter the elements of Matrix-1:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }

        //Input Matrix-2
        System.out.println("Enter the elements of Matrix-2:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }

        //Matrix Multiplication
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                mat[i][j]=0;
                for(int k=0;k<c1;k++){
                    mat[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }

        //Displaying Resultant Matrix
        System.out.println("Resultant Matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
