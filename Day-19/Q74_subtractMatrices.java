import java.util.*;

public class Q74_subtractMatrices {
    public static void main(String[] args) {
        int mat1[][]={{1,3,4},{5,7,9}};
        int mat2[][]={{7,4,2},{5,3,8}};

        int r=mat1.length;
        int c=mat1[0].length;
        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=mat1[i][j]-mat2[i][j];
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
