import java.util.*;

public class Q101_numberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("Enter range:");
            int m=sc.nextInt();
            int n=sc.nextInt();

            double randomNum=Math.floor(Math.random()*(n-m)+1);
            boolean isWin=false;
            while(!isWin){
                System.out.println("Guess the number:");
                int num=sc.nextInt();
                if(num==randomNum){
                    System.out.println("Congratulation you Guess the right number.");
                    System.out.println("__Game Over!__");
                    isWin=true;
                    break;
                }
                else if(num<randomNum){
                    System.out.printf("Your guessed number is too small. Guess the large number than %d ",num);
                    System.out.println();
                }
                else{
                    System.out.printf("Your guessed number is too large. Guess the small number than %d",num);
                    System.out.println();
                }
            }
            flag=false;
        }
    }
}
