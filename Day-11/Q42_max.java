import java.util.*;

public class Q42_max {
    static int findMax(int n1,int n2){
        int max=n1>n2?n1:n2;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.printf("maximum of %d and %d = %d",num1,num2,findMax(num1, num2));
    }
}
