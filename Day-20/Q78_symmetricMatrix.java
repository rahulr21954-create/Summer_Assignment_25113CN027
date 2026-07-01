import java.util.*;

public class Q78_symmetricMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int r=sc.nextInt();
        System.out.println("Enter columns:");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];

        //Input Matrix
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              mat[i][j]=sc.nextInt();  
            }
        }
        
        boolean flag=true;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]!=mat[j][i]){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        
        if(flag){
            System.out.println("Matrix is Symmetric.");
        }
        else{
            System.out.println("Matrix is NOT Symmetric.");
        }
        sc.close();
    }
}
