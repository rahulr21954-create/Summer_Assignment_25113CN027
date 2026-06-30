import java.util.*;

public class Q76_diagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Matrix rows:");
        int r=sc.nextInt();
        System.out.println("Enter the Matrix column:");
        int c=sc.nextInt();
        int [][]mat=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int colm=c-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j || j==colm){
                    sum+=mat[i][j];
                }
               
            }
            colm--;
        }
        System.out.println("Diagonal Sum = "+sum);
    }
}
