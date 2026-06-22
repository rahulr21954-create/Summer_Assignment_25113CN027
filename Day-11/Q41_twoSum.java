import java.util.*;

public class Q41_twoSum {
    static int sum(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int total=sum(num1,num2);
        System.out.printf("Sum of %d and %d = %d",num1,num2,total);
    }
}
